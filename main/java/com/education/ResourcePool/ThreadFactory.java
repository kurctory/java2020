package com.education.ResourcePool;

public class ThreadFactory extends ObjectFactory<Thread> {
    @Override
    public Thread createObject() {
        return new Thread();
    }
}
