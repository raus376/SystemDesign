package com.design.pattern.creationaldesignpatten.abstractfactorypattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PCFactory implements ComputerAbstract{
   private String ram;
   private String cpu;
   private String hdd;

    public PCFactory(String pc1, String pc11, String pc12) {
        this.ram = pc1;
        this.cpu = pc11;
        this.hdd = pc12;
    }

    @Override
    public Computer createrComputer() {
        return new PC(this.ram, this.cpu, this.hdd);
    }
}
