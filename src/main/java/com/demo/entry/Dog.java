package com.demo.entry;

import org.springframework.stereotype.Component;

/**
 * @version: 1.0
 * @Description: Dog
 * @Author: wuchang
 * @Date: 2020/04/03 10:11
 **/
@Component
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
