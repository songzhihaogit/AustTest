package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramter1(String name,int age){
        System.out.println("name = "+ name+ ";    " +"age = "+ age);
    }
}
