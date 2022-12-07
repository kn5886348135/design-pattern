package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:30
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public abstract class Beast extends Prototype<Beast> {

    public Beast(Beast source) {
    }
}
