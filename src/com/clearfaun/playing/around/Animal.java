package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 5/5/16.
 */
public class Animal {




    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age){
        this.age = age;
        this.name = name;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
