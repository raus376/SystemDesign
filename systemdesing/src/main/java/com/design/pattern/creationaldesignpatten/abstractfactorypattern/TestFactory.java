package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("PC1", "PC1","PC1"));
        System.out.println(pc);

    }
}
