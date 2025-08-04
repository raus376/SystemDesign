package com.design.pattern.creationaldesignpatten.singleton;

//Static block initialization implementation is similar to eager initialization,
//except that instance of class is created in the static block that provides option
//for exception handling.

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
          throw new RuntimeException("Exception while creating instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
