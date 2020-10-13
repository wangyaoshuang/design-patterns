/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.patterns;

import com.wangyaoshuang.patterns.ICourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 2:55 PM
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
