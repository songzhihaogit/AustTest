package com.course.testng.suit;
import org.testng.annotations.*;
/**
 * 测试套件配置文件
 */
public class SuitConfig {
    @BeforeSuite
    public void beforSuit(){
        System.out.println("BeforSuit运行啦");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuit运行啦");
    }
    @BeforeTest
    public void beforeClass(){
        System.out.println("beforeClass 运行啦");
    }
    @AfterTest
    public void afterClass(){
        System.out.println("afterClass 运行啦");
    }
}
