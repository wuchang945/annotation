package com.demo.enu;

public enum TestEnum {
    TEST1("test1","测试1"),
    TEST2("test2","测试2");

    private String code;
    private String name;

    TestEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
