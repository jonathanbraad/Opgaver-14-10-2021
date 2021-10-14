package com.company.ex1;

import java.util.ArrayList;

public class Dog {
    String name;
    boolean isHungry;
    String Owner;
    ArrayList<String> offSpringList = new ArrayList<String>();

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public String getOwner() {
        return Owner;
    }

    public String feedDog() {
        isHungry = false;
        return "The dog has been fed";
    }

    public void setOwner(String owner) {
        Owner = owner;
    }



    public void addOffSpring(String offSpring) {
        offSpringList.add(offSpring);
    }
}
