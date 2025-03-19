package org.mittal;

public class Methodsdemojava {
    public static void main(String[] arg){

        Methodsdemojava m= new Methodsdemojava();
        String name=m.getData();
        System.out.println(name);

        //execute method of another class
        MethodDemo2 m1=new MethodDemo2();
        String name2=m1.getUserData();
        System.out.println(name2);

        System.out.println(getData2());

    }
    // why method= if you have some lines of codes which you want to reuse every time then wrap
    //one block and name this as method.
    //we declred method outside main bloack and execution is provided in main method.never declare method in main block.

//    public void getData(){
//        System.out.println("hello world");
//    }

      public String getData(){
          System.out.println("hello world");
          return "mittal rathod";
      }

      //if u use static word then method directly belong to class and need not to create an object for its execution
    public static String getData2(){
        System.out.println("hello world");
        return "mittal solanki";
    }
}
