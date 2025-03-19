package org.mittal;

public class MethodDemo2 {

    public static void main(String[] arg){
        //static method of other class can be use by class name in another class.
        Methodsdemojava.getData2();
    }

    public String getUserData(){
        System.out.println("hello");
        return "Ani";
    }


}
