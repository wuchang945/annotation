package com.demo.enu;

import com.demo.entry.Cat;
import com.demo.entry.Dog;

public enum AnimalEnum {
    DOG("dog", Dog.class),
    CAT("cat", Cat.class);

    private String type;
    private Class clz;

    AnimalEnum(String type, Class clz) {
        this.type = type;
        this.clz = clz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }

    public static AnimalEnum getEnumByCode(String type) {
        AnimalEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            AnimalEnum rte = arr[i];
            if (rte.getType().equals(type)) {
                return rte;
            }
        }
        return null;
    }
}
