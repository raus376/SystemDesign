package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Server extends Computer{
    private String ram;
    private String cpu;
    private String hdd;

    Server(String ram, String cpu, String hdd) {
        super();
    }

    /**
     * @return
     */
    @Override
    public String getRAM() {
        return this.ram;
    }

    /**
     * @return
     */
    @Override
    public String getHDD() {
        return this.hdd;
    }

    /**
     * @return
     */
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
