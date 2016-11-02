package com.nanhu.dao;
import static org.junit.Assert.*;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by liliang on 2016/10/31.
 */
public class JooqExample implements CommandLineRunner {
    private final DSLContext dslContext;

    @Autowired
    public JooqExample(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public void run(String... strings) throws Exception {
        assertNotNull(dslContext);
    }
}
