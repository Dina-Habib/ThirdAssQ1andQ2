/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cha3p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dinahabib
 */
public class Cha3p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       //Q1
      /* int sum=0;
       double avg=0.0;
       List<Integer> list=new LinkedList<>();
       Random rn = new Random();
        for(int i=0;i<30;i++){
            list.add(rn.nextInt(100));
        }
        Collections.sort(list);
        System.out.println("Sorted Array is: "+list);
         for (int i: list) {
        sum += i;
    }
         System.out.println("The sum of elements is: "+sum);
         avg=sum/(list.size());
         System.out.println("The average of elements is: "+avg);*/
      
      //Q2
      Scanner scanner=new Scanner(new File("/Users/dinahabib/NetBeansProjects/Cha3p1/src/cha3p1/input.txt"));
       HashMap <String,Integer> wmap = new HashMap<>();
       HashMap <Character,Integer> cmap = new HashMap<>();
            while (scanner.hasNext()) {
               String word= scanner.next();
               Integer i=wmap.get(word);
              if(i == null){
                    wmap.put(word, 1);
                }
                else {
                    wmap.put(word, i+1);
                }
              char [] arr =word.toCharArray();
              for(char c: arr){
                  if(cmap.containsKey(c)){
                      cmap.put(c,cmap.get(c)+1);
                  }else{
                      cmap.put(c, 1);
                  }
              }
            }
            System.out.println(wmap.toString());
            System.out.println(cmap.toString());
    }
    
}
