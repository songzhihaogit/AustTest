package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/27 0027.
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2运行");
    }
}
