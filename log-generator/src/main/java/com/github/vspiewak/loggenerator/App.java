package com.github.vspiewak.loggenerator;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);
    private static AtomicLong total = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {

        // parse params
        InputParameters params = new InputParameters();
        JCommander commander = new JCommander(params);
        try {
            commander.parse(args);
        } catch (ParameterException e) {
            commander.usage();
            System.exit(1);
        }

        // init
        log.trace("starting");

        final long start = System.nanoTime();
        final int threads = params.threads;

        // add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                long elapsed_loop = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
                log.trace("generated {} logs in {}ms using {} threads", total.get(), elapsed_loop, threads);
                log.trace("shutdown");
            }
        });

        // will be repeated every params.repeat milliseconds
        do {

            final long start_loop = System.nanoTime();
            AtomicLong counter = new AtomicLong(0);
            LogExecutor executor = new LogExecutor(threads);

            //generate params.logs
            while (counter.get() < params.logs) {
                total.incrementAndGet();
                counter.incrementAndGet();
                int seed = new Random().nextInt(10);
                if (seed > 7) {
                    executor.add(new SellRequest(total.get()));
                } else {
                    executor.add(new SearchRequest(total.get()));
                }
            }

            // wait the end
            executor.finish();

            // if repeat option
            if (params.repeat > 0) {

                // print log generated during the loop
                long elapsed_loop = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start_loop);
                log.trace("generated {} logs in {}ms using {} threads", counter.get(), elapsed_loop, params.threads);

                // sleep until the end of the interval
                long sleep_time = params.repeat - elapsed_loop;
                if (sleep_time > 0) {
                    log.trace("sleep: {}ms", sleep_time);
                    Thread.sleep(sleep_time);
                }
            }

        } while (params.repeat > 0);

    }

}
