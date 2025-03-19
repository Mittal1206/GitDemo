package org.mittal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejavabrushup {

    public static void main(String[] arg){

        int[] arr={1,2,3,4,5,6,7,8,9,122};

        //find value divided by 2//check if array is multiple of 2 then use break
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                System.out.println(arr[i]);
                break;
            }
            else {
                System.out.println(arr[i] + " is not multiple of 2");
            }
        }

        //Array list
        ArrayList<String> a=new ArrayList<String>();
        a.add("rahul");
        a.add("shetty");
        a.add("meena");
        a.remove(1);
        System.out.println(a.get(0));
        System.out.println(a);

        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }

        for (String s:a){
            System.out.println(s);
        }

        //item is present in arraylist or not
        //System.out.println(a.contains("rahul"));

        //converting normal array into arraylist
        String[] name = {"rahul", "shetty", "selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.contains("shetty"));


    }

}
