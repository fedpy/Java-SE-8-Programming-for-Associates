package com.readlearncode.lesson1.section3.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String... args){

        int scores[] = new int[4];
        if(scores.length < 4) {
            scores[4] = 180;
        }

    }

}