/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.wangyaoshuang.abstractfactroy;

/**
 * @author wangyaoshuang
 * @desc TODO
 * @create 2020/10/13 8:37 PM
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaAbstractFactory();
        factory.createNote().note();
        factory.createVideo().video();
    }

}
