package com.example.designpattern.creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author jack
 * @version 1.0
 * @description orcish 兽人
 * @date 2022/12/06/15:03
 */
public class OrcBlacksmith implements Blacksmith {
    private static final Map<WeaponType, OrcWeapon> ORCARSENAL;
    static {
        ORCARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }


    @Override
    public String toString() {
        return "The orc blacksmith";
    }

}
