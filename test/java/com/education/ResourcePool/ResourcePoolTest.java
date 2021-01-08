package com.education.ResourcePool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;

class ResourcePoolTest {

    @Test
    void testCreatePool() {
        int size = 2;
        ResourcePool<Thread> threadPool = new ResourcePool<>(size, 1000, new ThreadFactory());
        Assertions.assertEquals(2, threadPool.getPoolSize());
        size = 5;
        ResourcePool<FileWriter> filePool = new ResourcePool<>(size, 1000, new FileFactory());
        Assertions.assertEquals(5, filePool.getPoolSize());
    }

    @Test
    void throwsExceptionAcquirePoolIsTerminated() {
        int size = 2;
        ResourcePool<Thread> threadPool = new ResourcePool<>(size, 1000, new ThreadFactory());
        threadPool.shutdown();
        Assertions.assertThrows(IllegalStateException.class, () -> threadPool.acquire());
    }

    @Test
    void throwsExceptionReturnBackPoolIsTerminated() {
        int size = 2;
        ResourcePool<Thread> threadPool = new ResourcePool<>(size, 1000, new ThreadFactory());
        Thread worker = threadPool.acquire();
        threadPool.shutdown();
        Assertions.assertThrows(IllegalStateException.class, () -> threadPool.returnBack(worker));
    }

    @Test
    void testTryCreateNewResourceError() {
        int size = 2;
        ResourcePool<Thread> threadPool = new ResourcePool<>(size, 1000, new ThreadFactory());
        Thread worker = threadPool.acquire();
        PoolElement<Long, Thread> newResource = threadPool.tryCreateNewResource(0);
        Assertions.assertEquals(null, newResource);
    }
}