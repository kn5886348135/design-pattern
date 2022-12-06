package com.example.designpattern.creational.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack
 * @version 1.0
 * @description 工厂方法设计模式
 * @date 2022/12/06/14:54
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private static final String MANUFACTURED = "{} manufactured {}";

    public static void main(String[] args) {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
    }
}
