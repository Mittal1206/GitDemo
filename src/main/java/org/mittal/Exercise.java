package org.mittal;

public class Exercise {
    public static void main (String[] args) {

        int[] arr= {11,22,33,44,55};
        System.out.println(arr[0]);
        System.out.println(arr.length);

        System.out.println("Elements in reverse order: ");
        for (int i=arr.length-1; i>=0; i-- ){
            System.out.println(arr[i]);
        }

        System.out.println("Total elements in the array: " + arr.length);

    }
}
