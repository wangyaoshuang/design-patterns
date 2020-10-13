/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.factorymethodpattern;

import com.wangyaoshuang.patterns.ICourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 6:07 PM
 */
public interface ICourseFactory {
    public ICourse create();
}
