package com.demo.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LoginRequire {
    boolean require() default true;
}
