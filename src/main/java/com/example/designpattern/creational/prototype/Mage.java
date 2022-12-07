package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:35
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public abstract class Mage extends Prototype<Mage> {
    public Mage(Mage source) {
    }

}
