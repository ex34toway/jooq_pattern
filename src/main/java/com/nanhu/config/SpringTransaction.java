package com.nanhu.config;

import org.jooq.Transaction;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by liliang on 2016/11/1.
 */
public class SpringTransaction implements Transaction {

    final TransactionStatus tx;

    SpringTransaction(TransactionStatus tx) {
        this.tx = tx;
    }
}
