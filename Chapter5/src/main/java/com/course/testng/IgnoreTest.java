package com.course.testng;
import org.testng.annotations.Test;
/**
 * 忽略测试  @Test(enabled = false)    false为不执行，true为执行
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("igonre1 执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("igonre2 执行");
    }
}
