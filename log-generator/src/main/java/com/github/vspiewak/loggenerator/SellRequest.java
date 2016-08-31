package com.github.vspiewak.loggenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SellRequest implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(SellRequest.class);
    private final long id;

    public SellRequest(final long id) {
        this.id = id;
    }

    @Override
    public void run() {
        log.info("{}", Utils.getRandomSell(id));
    }
}
