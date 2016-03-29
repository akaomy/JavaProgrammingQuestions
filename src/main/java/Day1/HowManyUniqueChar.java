package Day1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abarabash on 3/29/16.
 */
public class HowManyUniqueChar {

    @Test
    public void howManyEachCharInSent() {
        String string = "The quick brown fox jumps over the lazy dog";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        string = string.toLowerCase();
        string = string.replace(" ", "");

        for (char each : string.toCharArray()) {
            if (map.containsKey(each)) {
                int value = map.get(each);
                map.put(each, (value + 1));
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()){
            System.out.println(each);
        }
    }

}
