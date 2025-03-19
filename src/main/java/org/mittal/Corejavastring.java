package org.mittal;

public class Corejavastring {
    public static void main(String[] arg){
        //string id an object that represent sequence of character //String literal
        String s = "rahul shetty academy";//create one object if string value match
        String s1 = "rahul shetty academy";

        //new keyword
        String s2=new String("welcome");//create different object even if string value is same
        String s3=new String("welcome");

        String ss="mittal het pinkal";
        String[] splittedString=ss.split("het");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        //character one by one
//        for(int i=0; i<ss.length(); i++){
//            System.out.println(ss.charAt(i));
//        }

        //character in reverse order
        for (int i=ss.length()-1; i>=0; i--){
            System.out.println(ss.charAt(i));
        }

    }
}
