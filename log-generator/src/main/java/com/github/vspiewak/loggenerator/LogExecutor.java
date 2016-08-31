package com.github.vspiewak.loggenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LogExecutor {

    private final int nbThreads;
    private ExecutorService executor;

    public LogExecutor(int nbThreads) {
        this.nbThreads = nbThreads;
        executor = Executors.newFixedThreadPool(this.nbThreads);
    }

    public LogExecutor add(Runnable task) {
        executor.submit(task);
        return this;
    }

    public void finish() {

        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        while (!executor.isTerminated()) {
        }

    }
}
