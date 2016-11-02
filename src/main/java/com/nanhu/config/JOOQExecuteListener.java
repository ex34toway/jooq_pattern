package com.nanhu.config;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteType;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;

import java.util.Map;

/**
 * Created by liliang on 2016/11/1.
 */
public class JOOQExecuteListener extends DefaultExecuteListener {

    /**
     * serialVersionUID = 631625131076280036L;
     */
    private static final long serialVersionUID = 631625131076280036L;

    public static Map<ExecuteType, Integer> STATISTICS = Maps.newHashMap();

    @Override
    public void exception(ExecuteContext ctx) {
        SQLDialect dialect = ctx.configuration().dialect();
        SQLExceptionTranslator translator = (dialect != null) ? new SQLErrorCodeSQLExceptionTranslator(dialect.name())
                : new SQLStateSQLExceptionTranslator();

        ctx.exception(translator.translate("jOOQ", ctx.sql(), ctx.sqlException()));
    }

    @Override
    public void start(ExecuteContext ctx) {
        synchronized (STATISTICS) {
            Integer count = STATISTICS.get(ctx.type());
            if (count == null) {
                count = 0;
            }
            STATISTICS.put(ctx.type(), count + 1);
        }
    }

    @Override
    public void executeStart(ExecuteContext ctx) {
        // Create a new DSLContext for logging rendering purposes
        // This DSLContext doesn't need a connection, only the SQLDialect...
        // ... and the flag for pretty-printing
        DSLContext dslContext = DSL.using(ctx.dialect(),
                new Settings().withRenderFormatted(true));

        // If we're executing a query
        if (ctx.query() != null) {
            System.out.println(dslContext.renderInlined(ctx.query()));
        }
        // If we're executing a routine
        else if (ctx.routine() != null) {
            System.out.println(dslContext.renderInlined(ctx.routine()));
        }
        // If we're executing anything else (e.g. plain SQL)
        else if (!StringUtils.isBlank(ctx.sql())) {
            System.out.println(ctx.sql());
        }
    }
}
