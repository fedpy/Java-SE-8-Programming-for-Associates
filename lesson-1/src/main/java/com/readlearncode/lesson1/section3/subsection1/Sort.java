package com.readlearncode.lesson1.section3.subsection1;

import java.util.Arrays;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Sort {

    public static void main(String... args){

        int[] scores = {99, 180, 43, -20};
        Arrays.sort(scores);
        for(int x = 0; x < scores.length; x++){
            System.out.println(scores[x]);
        }

        String[] names = {"John", "Mark", "Alex"};
        Arrays.sort(names);
        for(int x = 0; x < names.length; x++){
            System.out.println(names[x]);
        }
    }
}