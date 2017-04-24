package com.company.AlgotithmsBootcamp;

import org.junit.Test;

/**
 * Created by borisgurtovyy on 4/23/17.
 */
public class BynSearch {

    public int binarySearch(int[] inputArr, int key){
        int start = 0;
        int end = inputArr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(inputArr[mid] == key){
                return mid;
            }
            if(key < inputArr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    @Test
    public void testBinarySearch(){
        int[] arr = {1,3,10,14,16,203,500};
        System.out.println("600`s position is " + binarySearch(arr, 600));
    }

}
