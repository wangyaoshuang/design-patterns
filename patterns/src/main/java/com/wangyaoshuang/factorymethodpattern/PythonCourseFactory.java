/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.factorymethodpattern;

import com.wangyaoshuang.patterns.ICourse;
import com.wangyaoshuang.simplefactory.PythonCourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 7:00 PM
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
