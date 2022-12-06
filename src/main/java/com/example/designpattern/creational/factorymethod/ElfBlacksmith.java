package com.example.designpattern.creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/15:03
 */
public class ElfBlacksmith implements Blacksmith {
    private static final Map<WeaponType, ElfWeapon> ELFARSENAL;
    static {
        ELFARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The elf blacksmith";
    }

}
