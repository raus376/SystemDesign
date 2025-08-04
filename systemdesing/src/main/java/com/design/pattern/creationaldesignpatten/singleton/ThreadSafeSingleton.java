package com.design.pattern.creationaldesignpatten.singleton;

import lombok.Synchronized;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {};

    public static Synchronized ThreadSafeSingleton() {
        if(threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return (Synchronized) threadSafeSingleton;
    }

//    Above implementation works fine and provides thread-safety but it reduces
//    the performance because of cost associated with the synchronized method,
//    although we need it only for the first few threads who might create the
//    separate instances (Read: Java Synchronization). To avoid this extra
//    overhead every time, double checked locking principle is used. In this
//    approach, the synchronized block is used inside if condition with an
//    additional check to ensure that only one instance of singleton class is
//    created.

//    Below code snippet provides the double checked locking implementation.

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if(threadSafeSingleton == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }
}
