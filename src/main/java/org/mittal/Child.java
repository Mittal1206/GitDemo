package org.mittal;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child extends Parent{

    //if not inheritate then second we can create object access the method
    @Test
    public void testRun(){
        //Constructor c= new Constructor();//default constructor
        Constructor c= new Constructor(3);//parametarised constructor
        System.out.println(c.increment());
        System.out.println(c.decrement());
        System.out.println(c.multiplyThree());

        doThis();
    }
}
