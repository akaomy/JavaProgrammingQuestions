package com.company.AlgotithmsBootcamp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by borisgurtovyy on 4/22/17.
 */
public class Polyndrom {


    boolean checkIfPolyndrom(String input){

        if(input.length() == 0 || input.length() == 1){
            return true;
        }

        int lastIndex = input.length() -1;
        if(input.charAt(0) == input.charAt(lastIndex)) {
            String smallerString = input.substring(1, lastIndex);
            return checkIfPolyndrom(smallerString);
        } else {
            return false;
        }
    }


    @Test
    public void checkPoly() {
        String poly = "abcdcba";
        Assert.assertTrue(checkIfPolyndrom(poly));
    }

    @Test
    public void checkNotPoly() {
        String notAPoly = "abcdecba";
        Assert.assertFalse(checkIfPolyndrom(notAPoly));
    }

    @Test
    public void check1CharPoly() {
        String poly = "a";
        Assert.assertTrue(checkIfPolyndrom(poly));
    }


}
