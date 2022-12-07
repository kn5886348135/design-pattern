package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:39
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Warlord extends Prototype<Warlord> {

    public Warlord(Warlord source) {
    }

}
