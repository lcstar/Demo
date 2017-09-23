package com.lc.activemq.TestOnline;

import java.io.Serializable;

class Student implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}