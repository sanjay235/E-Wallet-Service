package com.sanjay.ewallet.walletservice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerWrapper {
    public static Logger getLogger(Class clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
