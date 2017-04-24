package com.company.AlgotithmsBootcamp;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by borisgurtovyy on 4/22/17.
 */
public class HowManyChars {

    public HashMap<Character, Integer> howManyCharsInWord(String input){

        HashMap<Character, Integer> result = new HashMap<Character, Integer>();

        for(char each : input.toCharArray()) {
            if(!result.containsKey(each)) {
                result.put(each, 1);
            } else {
                int value = result.get(each);
                value++;
                result.put(each, value);
            }
        }

        for(char each: result.keySet()){
            int value = result.get(each);
            System.out.println(each + " => " + value);
        }

        return result;
    }

    @Test
    public void printAllCharacters() {
        String myString = "Abcb";
        HashMap<Character, Integer> result = howManyCharsInWord(myString);
        HashMap<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('A', 1);
        expectedResult.put('b', 2);
        expectedResult.put('c', 1);
        Assert.assertEquals(result, expectedResult);
    }

}
