/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.simplefactory;

import com.wangyaoshuang.patterns.ICourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 5:01 PM
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
