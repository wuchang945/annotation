package com.demo.entry;

import org.springframework.stereotype.Component;

/**
 * @version: 1.0
 * @Description: Cat
 * @Author: wuchang
 * @Date: 2020/04/03 10:12
 **/
@Component
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
