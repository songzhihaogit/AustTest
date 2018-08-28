package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/27 0027.
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    //执行test2前必须执行test1，test1为前置条件
    //被依赖的方法test1如果执行失败了，test2就会被忽略不执行
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
