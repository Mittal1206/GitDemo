package org.mittal;

public class Constructor extends Superkey {

    int a;

    public Constructor(int i) {
        super(i);
        this.a=i;
    }

    public int increment(){
        a=a+1;
        return a;
    }

    public int decrement(){
        a=a-1;
        return a;
    }
}
