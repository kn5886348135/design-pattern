package com.example.designpattern.creational.abstractfactory;

import lombok.Data;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:45
 */
@Data
public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    public static class FactoryMaker {
        public enum KingdomType {
            ELF, ORC
        }

        public static KingdomFactory makeFactory(FactoryMaker.KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

}
