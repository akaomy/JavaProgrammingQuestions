package Day1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abarabash on 3/29/16.
 */
public class HowManyUniqueChar {

    public void printResult(HashMap<Character, Integer> map){
        for (Map.Entry<Character, Integer> each : map.entrySet()){ //iterating through entrySet of key-value pair
            System.out.println(each); //printing each pair
        }
    }

    public void howManyEachCharInSent(String input) {

        HashMap<Character, Integer> result = new HashMap<Character, Integer>(); //declare result variable

        input = input.toLowerCase(); //making all characters lower case
        input = input.replace(" ", ""); //deleting spaces

        for (char each : input.toCharArray()) { //traversing through input string
            if (result.containsKey(each)) { //if result HashMap already contains character
                int value = result.get(each); //getting the value stored in Map
                result.put(each, (value + 1));//incrementing value by 1
            } else {
                result.put(each, 1); //else if there is not such a character in result Map - add it
            }
        }

        printResult(result); //use existing method to printout result
    }

    @Test
    public void test001(){
        String string = "The quick brown fox jumps over the lazy dog";
        howManyEachCharInSent(string);
    }

}
