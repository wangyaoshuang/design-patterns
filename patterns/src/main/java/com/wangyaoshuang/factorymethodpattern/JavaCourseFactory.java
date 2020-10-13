/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.factorymethodpattern;

import com.wangyaoshuang.patterns.ICourse;
import com.wangyaoshuang.patterns.JavaCourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 6:08 PM
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
