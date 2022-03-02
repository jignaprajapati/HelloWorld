package com.example.Collection;
import java.util.*;
public class TestJavaCollection2 {
    public static void main(String[] args){
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Mayan");
        al.add("Jigna");
        al.add("Ravi");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
