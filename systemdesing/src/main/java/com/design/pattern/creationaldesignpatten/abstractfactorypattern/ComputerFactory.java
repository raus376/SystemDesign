package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstract computerAbstract) {
        return computerAbstract.createrComputer();
    }
}
