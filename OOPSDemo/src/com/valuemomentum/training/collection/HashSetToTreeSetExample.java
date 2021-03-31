package com.valuemomentum.training.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSetExample {
    
    public static void main(String[] args) {
        
        HashSet<Integer> hSetNumbers = new HashSet<Integer>();
        
        hSetNumbers.add(23);
        hSetNumbers.add(34);
        hSetNumbers.add(45);
        hSetNumbers.add(12);
        hSetNumbers.add(42);
     
        
        System.out.println("HashSet contains: " + hSetNumbers);
        
        /*
         * To convert HashSet to TreeSet, use the
         * TreeSet constructor and pass the HashSet object
         */
        TreeSet<Integer> tSetNumbers = new TreeSet<Integer>( hSetNumbers );
        
        tSetNumbers.add(25); // In tree set we can add and remove the data or elements but not in hash set
        tSetNumbers.remove(42);
        System.out.println("TreeSet contains: " + tSetNumbers);
    }
 
}
