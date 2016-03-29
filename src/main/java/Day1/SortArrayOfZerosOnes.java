package Day1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by abarabash on 3/29/16.
 */
public class SortArrayOfZerosOnes {

    @Test
    public void sortArrayOfZeroOnes() {
        int[] anArray = {0,1,0,0,1,1,0};
        System.out.println(Arrays.toString(anArray));

        int size = anArray.length;
        int sum = 0;
        int[] result = new int[size];

        for (int i : anArray)
            sum+=i;

        for (int i = 0; i < size-sum; i++)
            result[i] = 0;

        for (int i = size-sum; i < size ; i++)
            result[i] = 1;

        System.out.println(Arrays.toString(result));
    }

}
