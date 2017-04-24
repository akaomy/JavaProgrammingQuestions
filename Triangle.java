package com.company.AlgotithmsBootcamp;

import org.junit.Test;

/**
 * Created by borisgurtovyy on 4/23/17.
 */
public class Triangle {

    public void printTriangle(int currentHeight, int height){

        if( currentHeight == 1){
            printSpaces(currentHeight);
            printStars(height - currentHeight);
        }
        else {
            printSpaces(currentHeight);
            printStars(height - currentHeight);

            printTriangle(currentHeight - 1, height);

        }
    }


    public void printSpaces(int x){
        for(int i = 0; i < x; i++){
            System.out.print(" ");
        }
    }
    public void printStars(int x){
        for(int i = 0; i <= x; i++){
            System.out.print("* ");
        }
        System.out.print("\n");

    }

    @Test
    public void test001(){
        printTriangle(5,5);
    }

}
