package com.valuemomentum.training.collection;

 

import java.util.List;
import java.util.ArrayList;

 

public class ArrayListExample {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 List<Book1> list=new ArrayList<Book1>();
 
 //Creating a List of Books
 Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
 Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
 Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
 
 //Adding book to list
     list.add(b3);
     list.add(b2);
     list.add(b1);
     
     
     //Traversing list
     for(Book1 b:list)
     {
         System.out.println(b.id+"    "+b.name+"     "+b.author+"     "+b.publisher+"     "+b.quantity);
     }
    }
    
    

 

}