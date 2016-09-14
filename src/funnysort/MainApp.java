/*
 * Program: 
 * 1. The funny sort is about sorting the given array of integers into 
 * ascending and descending alternatively; i.e : smallest,biggest,next smallest, next biggest... and so on
 * 2.Sort the given array in such that all the odd integers have the longest distance between each other
 * 
 * Author: vignan cheruku
 */

package funnysort;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
	//Function implementation for Funny Sort
     public static List<Integer> funnySort(List<Integer> unsorted){
            List<Integer> sorted = new ArrayList<Integer>();
             int index=0;
            for(int i=0,j=unsorted.size()-1;i<=Math.ceil(unsorted.size()/2) && j>=Math.ceil(unsorted.size()/2) ;i++,j--){
               
                    sorted.add(index,unsorted.get(i));
                if(i!=j)
                    sorted.add(index+1,unsorted.get(j));                    
                index=index+2;
            }
            return sorted;
        }
     
    //Function implementation for Distance odd Numbers 
    public static List<Integer> distantOddNumbers(List<Integer> disOdd) {
        
        int counter=0;int i;
        int size=disOdd.size();
        for (i=0; i< size; i++)
        {
            if(disOdd.get(i)%2!=0){
                counter++;
            }
        }
        //System.out.println("counter"+counter);
        int index=0;int val;
        if(counter==1 && counter==size){}
        else if(counter==2){        
        for (i=0; i< size; i++)
        {
            val=disOdd.get(i);
            if(val%2!=0 || val%2<0 ){
                disOdd.remove(i);
                disOdd.add(index,val);
                index=size-1;
               
            }
        }
        }
        else{
        //To-do
        }
        return disOdd;
    }
    public static void main(String args[])
    {
        List<Integer> unsorted = Arrays.asList(1, 2, 3, 19, 5, 12, 26);
        List<Integer> disOdd1 = new ArrayList<Integer>();
        disOdd1.add(8);
        disOdd1.add(1);
        disOdd1.add(2);
        disOdd1.add(3);
        disOdd1.add(2);
        
        //Normal Sort
        Collections.sort(unsorted);
        System.out.println("Normal Sort");
        for(int i=0;i<unsorted.size();i++){
                System.out.println(unsorted.get(i));
            }  
        
        List<Integer> sorted = funnySort(unsorted);
        
        //Funny Sort Implementation
         System.out.println("After Funny Sort");
         for(int i=0;i<sorted.size();i++) {
                System.out.println(sorted.get(i));
            }  
         
         //Distance Odd Sort Implementation
         System.out.println("Before Distance odd ");
         for(int i=0;i<disOdd1.size();i++)
            {                     
            System.out.println(disOdd1.get(i));
            }  
        List<Integer> disOddNew = distantOddNumbers(disOdd1);
         System.out.println("After Distance odd ");
             for(int i=0;i<disOddNew.size();i++)
            {
            System.out.println(disOddNew.get(i));
            }  
        
        
    }
}



