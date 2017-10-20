package com.lc.httpClientUtil.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.lc.httpClientUtil.model.Student;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void jsonToObject() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        Student stu = new Student();
        stu.setName("刘畅");
        stu.setSex("男");
        stu.setHeigh(180);
        String json = gson.toJson(stu);
        Student stu1 = gson.fromJson(json, Student.class);
        System.out.println(stu1);

    }

    @Test
    public void httpClientJsonToObject() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        List<Student> stus = new ArrayList<Student>();
        for (int i = 0; i < 9; i++) {
            Student stu = new Student();
            stu.setName("test" + i);
            stu.setHeigh(160 + i);
            stu.setSex("男");
            stus.add(stu);
        }
        String json = gson.toJson(stus);
        List<Student> students = (List<Student>)getObject(json);
        for (Student stu : students) {
            System.out.println(stu.toString());
        }

    }

    public Object getObject(String json){
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(json,new TypeToken<List<Student>>(){}.getType());
    }

}
