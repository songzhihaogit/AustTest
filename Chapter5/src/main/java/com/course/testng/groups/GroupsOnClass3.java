package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/27 0027.
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
