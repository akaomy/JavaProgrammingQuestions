package Day1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abarabash on 3/29/16.
 */
public class HowManyUniqueChar {

    public void printResult(HashMap<Character, Integer> map){
        for (Map.Entry<Character, Integer> each : map.entrySet()){
            System.out.println(each);
        }
    }

    public void howManyEachCharInSent(String string) {

        HashMap<Character, Integer> result = new HashMap<Character, Integer>();

        string = string.toLowerCase();
        string = string.replace(" ", "");

        for (char each : string.toCharArray()) {
            if (result.containsKey(each)) {
                int value = result.get(each);
                result.put(each, (value + 1));
            } else {
                result.put(each, 1);
            }
        }

        printResult(result);
    }

    @Test
    public void test001(){
        String string = "The quick brown fox jumps over the lazy dog";
        howManyEachCharInSent(string);
    }

}
