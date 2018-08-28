package com.course.testng;

import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public class TimeOutTest {
    //测试成功，睡眠时间小于返回时间
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("测试成功");
    }
    //测试失败，睡眠时间大于返回结果的时间
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
