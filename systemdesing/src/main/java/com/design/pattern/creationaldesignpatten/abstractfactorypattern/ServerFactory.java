package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ServerFactory implements ComputerAbstract{
    private String ram;
    private String cpu;
    private String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        super();
    }

    @Override
    public Computer createrComputer() {
        return new Server(this.ram, this.cpu, this.hdd);
    }
}
