package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public class mulitThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
