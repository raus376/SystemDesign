package com.design.pattern.creationaldesignpatten.factorypattern;

public class ComputerFactory {

    public Computer getComputer(String type, String ram, String hdd, String cpu) {
        if("PC".equals(type)) return new PC(ram, hdd, cpu);
        else if("SERVER".equals(type)) return new Server(ram,hdd, cpu);
        else return null;
    }
}
