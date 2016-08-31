package com.github.vspiewak.loggenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchRequest implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(SearchRequest.class);
    private final long id;

    public SearchRequest(final long id) {
        this.id = id;
    }

    @Override
    public void run() {
        log.info("{}", Utils.getRandomSearch(id));
    }
}
