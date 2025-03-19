package org.mittal;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {

    //@Test
    public void regular(){
        ArrayList<String> names=new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekha");
        names.add("Adam");
        names.add("Ram");
        int count=0;

        for (int i=0; i<names.size(); i++)
        {
           String actual= names.get(i);
           if(actual.contains("A"))
           {
             count++;
           }
        }
        System.out.println(count);
    }

    //@Test
    public void streamFilter() {
        ArrayList<String> names=new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekha");
        names.add("Adam");
        names.add("Ram");

        Long total=names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(total);

        Long c= Stream.of("Abhijeet","Don","Alekha","Adam","Ram").filter(s->s.startsWith("A")).count();
        System.out.println(c);

        //print all stream have more than 4 character provide only 1 result
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));


    }

    @Test
    public void streamMap(){

        ArrayList<String> names=new ArrayList<>();
        names.add("Rohan");
        names.add("Don");
        names.add("Jigar");


        //print name which has a letter "a" as last letter with uppercase
        //Stream.of("Abhijeet","Don","Alekha","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        //print name which has first letter as "A" as sorted
        List<String> name = Arrays.asList("Abhijeet","Don","Alekha","Adam","Rama");//converting array as list
        //name.stream().filter(s->s.startsWith("A")).sorted().forEach(s-> System.out.println(s));

        //Merging 2 different Lists
        Stream<String> newStream=  Stream.concat(names.stream(),name.stream());
        //newStream.sorted().forEach(s-> System.out.println(s));
        boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test
    public void streamcollect()
    {
        List<String> ls= Stream.of("Abhijeet","Don","Alekha","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));

        List<Integer> value= Arrays.asList(3,2,2,7,5,6,8);
        System.out.println(value.get(2));
        //sorter array - 3rd index 2,3,5,6,7,8
        value.stream().distinct().forEach(s-> System.out.println(s));
        List<Integer> li= value.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(0));
    }
}
