//This Class is used to Sort elements in Array and Set

package com.collectionPractise;


import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ArraytoSory {
    public static void main(String args[])
    {
        String []names={"Harika","Swathi","Mounika","Puri","Keerthi"};
       TreeSet<String> sort=new TreeSet<String>();
        for(String t:names)
        {
        	sort.add(t);
        }
        System.out.println("Set is sorted with ascending order: "+sort);
        System.out.println("Set is sorted with descending order: "+sort.descendingSet());
        System.out.println("Set is searched with specific string: "+sort.contains("5"));
        System.out.println("Length of Set is: "+sort.size());
        
        Arrays.sort(names);
        System.out.println("Sorting Array with Array Utility class: "+Arrays.toString(names));
        Arrays.sort(names,Collections.reverseOrder());
        System.out.println("Soritng Array with Array Utility class with Descending order: "+Arrays.toString(names));
        System.out.println("Searching Array for a specific element found at location: "+Arrays.binarySearch(names, "Swathi"));
        System.out.println("Length of the array is: "+names.length);
    }
}
