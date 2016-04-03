package Day1;

import org.junit.Test;

/**
 * Created by abarabash on 3/29/16.
 */
public class MaxDifference {

    static int maxDifference(int[] arrayOfIntegers) {
        int result = 0;

        if(arrayOfIntegers.length == 0){
            result = 0;
        }

        if(arrayOfIntegers.length == 1){
            result = arrayOfIntegers[0];
        }

        if(arrayOfIntegers.length > 1){
            int indexOfMax = findIndexOfMax(arrayOfIntegers);

            int minBeforeMax = findMinBeforeMax(arrayOfIntegers, indexOfMax);
            result = arrayOfIntegers[indexOfMax] - minBeforeMax;
        }

        return result;
    }

    private static int findMinBeforeMax(int[] arr, int indexOfMax){
        int min = arr[0];

        for(int i = 0; i < indexOfMax; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

    private static int findIndexOfMax(int[] arr) {
        int indexOfmax = 0;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                indexOfmax = i;
            }
        }
        return indexOfmax;
    }

    @Test
    public void test001(){
        int[] arr = {7,2,3,10,2,4,8,1};

        System.out.println(maxDifference(arr));
    }

    @Test
    public void test002(){
        int[] arr = {6,7,9,5,6,3,2};

        System.out.println(maxDifference(arr));
    }

}
