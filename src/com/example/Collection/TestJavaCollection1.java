package com.example.Collection;
import java.util.*;

public class TestJavaCollection1 {
    public static  void main(String[] args){
        ArrayList<String> list =new ArrayList<String>();
        list.add("Ravi");
        list.add("Mayan");
        list.add("Jigna");
        list.add("Suresh");
        Iterator itr  = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
