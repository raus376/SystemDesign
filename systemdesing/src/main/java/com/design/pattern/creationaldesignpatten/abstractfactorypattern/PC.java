package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PC extends Computer{
    private String ram;
    private String cpu;
    private String hdd;

    public PC(String ram, String cpu, String hdd) {
        super();
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
