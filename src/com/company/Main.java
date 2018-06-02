package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int i, y=10, k ;
       String a;


       /*String words = new String ("Thee mou ti OYFO");
       ArrayList<Character> letters = new ArrayList<Character>();
        for (i=0; i<words.length() ; i++){
           letters.add(words.charAt(i));

        }
        System.out.println(letters);
        System.out.println(letters.get(5));
        */


      /*int[] anArray = new int[10];
      for (i = 0; i < anArray.length; i++ ){
          anArray[i] = i+1;
          System.out.println("the index " + i + " of the array has the value of: " + anArray[i] );
          System.out.println(anArray.length);
      }*/
//
//      String[] array = new String[10];
//      int d = array.length;

 




        /*for (i = 10; i > 1; i--) {
            System.out.println("The value of 'i' is " + i);
            for (k = 0; k <= 3; k++)

        }*/
        /*while (y > i) {
            System.out.println("y is lower than i");
            System.out.println("the value of 'y' is " + y);
            y--;

        }*/

        String word;
        word = "lenovolovon";
        char[] arrayLetters = word.toCharArray();
        System.out.println(arrayLetters.length);
        int letterExistTimes = 0;

        //ArrayList<Integer> indexOfExistingLetters = new ArrayList(letterExistTimes);

        int f = 0;


        char c = 'o';


        for (i=0; i < arrayLetters.length; i++ ){



            System.out.println(i);
            if (c == arrayLetters[i]){

                letterExistTimes++;

                System.out.println("this letter is here");
               // indexOfExistingLetters.set(f, i);
               // f++;
            }else{

                System.out.println("it is not here");
            }

        }

        int j=0;

        int[] wordIndex = new int[letterExistTimes];

        for (i=0; i<arrayLetters.length; i++){
            if (c == arrayLetters[i]) {
                wordIndex[j] = i;
                j++;

            }
        }

        for (i=0; i<wordIndex.length; i++){
            System.out.println(wordIndex[i]);
        }
       // System.out.println(wordIndex[j]);
       // System.out.println(wordIndex[0]);
        //System.out.println(wordIndex[1]);
        //System.out.println(wordIndex[2]);
        //System.out.println(wordIndex[3]);





       // System.out.println(letterExistTimes);
      //  System.out.println(arrayLetters);


        //System.out.println("the new array has length of: " + indexOfExistingLetters.length );



    }


}
