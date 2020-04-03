package com.demo.controller;

import com.demo.annotation.LoginRequire;
import com.demo.context.AnimalContext;
import com.demo.entry.Animal;
import com.demo.enu.AnimalEnum;
import com.demo.enu.TestEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: 1.0
 * @Description: DemoController
 * @Author: wuchang
 * @Date: 2020/04/02 15:35
 **/
@RestController
public class DemoController {

    private static AnimalContext animalContet = new AnimalContext();

    @RequestMapping("index")
    @LoginRequire(require = false)
    public Object index (){
        return TestEnum.values();
    }

    @RequestMapping("index1")
    @LoginRequire
    public Object index1 (){
        return TestEnum.values();
    }

    @RequestMapping("index2/{type}")
    @LoginRequire
    public Object index2 (@PathVariable  String type){
        Animal instence = animalContet.getInstence(AnimalEnum.getEnumByCode(type));
        instence.eat();
        return type + "ok";
    }
}
