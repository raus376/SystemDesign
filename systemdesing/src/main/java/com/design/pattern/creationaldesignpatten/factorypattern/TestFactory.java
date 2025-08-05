package com.design.pattern.creationaldesignpatten.factorypattern;

public class TestFactory {

    public static void main(String[] agrs) {

        ComputerFactory computerFactory = new ComputerFactory();
        Computer pc = computerFactory.getComputer("PC", "PC1", "PC1", "PC1");
        Computer server = computerFactory.getComputer("SERVER", "PC2", "PC2", "PC2");

        System.out.println(pc);
        System.out.println(server);

    }
}
