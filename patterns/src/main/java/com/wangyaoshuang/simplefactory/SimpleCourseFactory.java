/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.simplefactory;

import com.wangyaoshuang.patterns.ICourse;
import com.wangyaoshuang.patterns.JavaCourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 5:02 PM
 */
public class SimpleCourseFactory {
//    public ICourse create(String name) {
//        if ("java".equals(name)) {
//            return new JavaCourse();
//        } else if("python".equals(name)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }
//    }
    // 改进版本传入Class名
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
