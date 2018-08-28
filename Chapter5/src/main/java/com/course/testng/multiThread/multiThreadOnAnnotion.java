package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程注解测试
 */
public class multiThreadOnAnnotion {
    //第一个参数为执行多少次，第二个参数是线程池里有多少
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());//打印当前运行线程ID
    }
}
