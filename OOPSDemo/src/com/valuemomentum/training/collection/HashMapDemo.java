package com.valuemomentum.training.collection;

import java.util.HashMap;

 

public class HashMapDemo 
{

 

    public static void main(String[] args) 
    {
        HashMap<Integer, String> languages = new HashMap<>();
        
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HAsjMap: "+languages);
        
        //get()  method to get value
        String value = languages.get(1);
        
        System.out.println("Value at Index 1: "+value);
        System.out.println("Value at Index 3: "+languages.get(3));
        
        //return set view of keys
        System.out.println("Keys: "+languages.keySet());
        
        //return set view of values
        System.out.println("Values: "+languages.values());
        
        //return set view of key/values pairs
        System.out.println("key/Values mapping: "+languages.entrySet());
        
        languages.replace(2, "c++");
        System.out.println("key/Values mapping after replace: "+languages.entrySet());
        
        //iterate through keys only
        
        System.out.println("keys: ");
        for(Integer key : languages.keySet())
        {
            System.out.print(key);
            System.out.print(",");
        }
        // iterate through key/value entries
     /*   System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet())
        {
          System.out.print(entry);
          System.out.print(", ");
        }*/

 

    }
}
