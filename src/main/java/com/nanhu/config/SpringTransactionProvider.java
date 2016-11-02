package com.nanhu.config;

import static org.springframework.transaction.TransactionDefinition.PROPAGATION_NESTED;

import org.jooq.TransactionContext;
import org.jooq.TransactionProvider;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by liliang on 2016/11/1.
 */
public class SpringTransactionProvider implements TransactionProvider {

    @Autowired
    private DataSourceTransactionManager txMgr;

    @Override
    public void begin(TransactionContext ctx) throws DataAccessException {
        // This TransactionProvider behaves like jOOQ's DefaultTransactionProvider,
        // which supports nested transactions using Savepoints
        TransactionStatus tx = txMgr.getTransaction(new DefaultTransactionDefinition(PROPAGATION_NESTED));
        ctx.transaction(new SpringTransaction(tx));
    }

    @Override
    public void commit(TransactionContext ctx) throws DataAccessException {
        txMgr.commit(((SpringTransaction) ctx.transaction()).tx);
    }

    @Override
    public void rollback(TransactionContext ctx) throws DataAccessException {
        txMgr.rollback(((SpringTransaction) ctx.transaction()).tx);
    }
}
