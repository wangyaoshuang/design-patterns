/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.factorymethodpattern;

import com.wangyaoshuang.patterns.ICourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 7:01 PM
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new PythonCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();
        iCourseFactory =  new JavaCourseFactory();
        iCourseFactory.create().record();

    }
}
