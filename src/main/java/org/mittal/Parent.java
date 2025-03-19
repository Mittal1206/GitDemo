package org.mittal;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {

    public void doThis(){
        System.out.println("I am parent class");
    }

    @BeforeMethod
    public void beforeRun(){
        System.out.println("first run");
    }

    @AfterMethod
    public void afterRun(){
        System.out.println("Last run");
    }
}
