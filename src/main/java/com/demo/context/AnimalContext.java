package com.demo.context;

import com.demo.app.SpringBeanUtil;
import com.demo.entry.Animal;
import com.demo.enu.AnimalEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @version: 1.0
 * @Description: AnimalContet
 * @Author: wuchang
 * @Date: 2020/04/03 10:16
 **/

public class AnimalContext {

    private static Map<String,Class> modelMap = new HashMap<>();

    public AnimalContext() {
        for (AnimalEnum value : AnimalEnum.values()) {
            this.modelMap.put(value.getType(),value.getClz());
        }
    }

    public static Animal getInstence(AnimalEnum animalEnum){
        Class aClass = modelMap.get(animalEnum.getType());
        Animal animal = (Animal) SpringBeanUtil.getBean(aClass);
        return animal;
    }
}
