package com.wangyaoshuang.patterns;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wangyaoshuang.simplefactory.PythonCourse;
import com.wangyaoshuang.simplefactory.SimpleCourseFactory;

import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

//@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        /** 面向接口的情况下会是这种直接调用的方式直接创建相应的实例化对象
         *  但是如果我们继续增加pythoncourse或者其他的更多课程
         *  我们的这部分代码会越来越臃肿，而且不易扩展，因此我们要想办法把这种依赖减弱，把细节隐藏，
         */
        ICourse iCourse = new JavaCourse();
        iCourse.record();
        // SpringApplication.run(PatternsApplication.class, args);
        // System.out.println("hello world");
        /**
         * 简单工厂模型
         *
         */
        // 这种模式会导致输入错误的问题
//        SimpleCourseFactory simpleCourseFactory = new SimpleCourseFactory();
//        ICourse iCourse1 = simpleCourseFactory.create("java");
//        iCourse1.record();
        // 改进版本
        SimpleCourseFactory simpleCourseFactory = new SimpleCourseFactory();
        simpleCourseFactory.create(PythonCourse.class).record();



    }

}
