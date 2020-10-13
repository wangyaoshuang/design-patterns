/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.abstractfactroy;

import com.wangyaoshuang.patterns.ICourse;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 8:30 PM
 */
public interface ICourseFactory {
    IVideo createVideo();
    INote createNote();
}
