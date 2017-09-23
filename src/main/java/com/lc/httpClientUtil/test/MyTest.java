package com.lc.httpClientUtil.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lc.httpClientUtil.model.Student;
import org.junit.Test;

public class MyTest {

    @Test
    public void jsonToObject(){
        Gson gson = new GsonBuilder().serializeNulls().create();
        Student stu = new Student();
        stu.setName("刘畅");
        stu.setSex("男");
        stu.setHeigh(180);
        String json = gson.toJson(stu);
        Student stu1 = gson.fromJson(json,Student.class);
        System.out.println(stu1);

    }
    @Test
    public void httpClientJsonToObject(){

    }

}
