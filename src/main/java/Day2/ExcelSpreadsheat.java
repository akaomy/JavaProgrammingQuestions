package Day2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.Assert.assertTrue;

/**
 * Created by abarabash on 3/29/16.
 */
public class ExcelSpreadsheat {

    public static final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public static HashMap<Integer, String> createMap(String[] array) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int i = 1;

        for (String each : alphabet) {
            hashMap.put(i, each);
            i++;
        }

        return hashMap;
    }


    public static Stack format(int num) throws Exception {

        Stack<Integer> result = new Stack<>();

        int letternum;

        if (num > 0) {
            while (num > 0) {
                letternum = num % 26;
                num = (num - letternum) / 26;

                if (letternum == 0) {
                    letternum = 26;
                }

                if (letternum == 26) {
                    num = num - 1;
                }

                result.push(letternum);
            }
        }
        else {throw new Exception("out of bound");}

        return result;

    }

    public static String convert(Stack<Integer> stack) {

        HashMap<Integer, String> hashMap = createMap(alphabet);

        String result = "";
        for (int each : stack) {
            result = hashMap.get(each) + result;
        }

        return result;
    }

    @Test
    public void test000() throws Exception {

        int n = 18877;

        for (int i = 1; i < n; i++) {
            System.out.println((format(i).toString()) + "    " + convert(format(i)));
        }
    }

    @Test
    public void test001() throws Exception {

        int n = 1844;

        assertTrue("ERROR", convert(format(n)).equals("BRX"));
    }

    @Test
    public void test002() throws Exception {

        int n = 26;

        assertTrue("ERROR", convert(format(n)).equals("Z"));
    }

    @Test
    public void test003() throws Exception {

        int n = 703;

        assertTrue("ERROR " + convert(format(n)), convert(format(n)).equals("AAA"));
    }

    @Test
    public void test004() throws Exception {

        int n = 16384;

        assertTrue("ERROR " + convert(format(n)), convert(format(n)).equals("XFD"));
    }

    @Test
    public void test005_negative_OutOfBound_zero() {

        int n = 0;

        try {
            convert(format(n));
        } catch (Exception e) {
            assertTrue(e.toString().contains("out of bound"));
        }
    }

    @Test
    public void test006_negative_OutOfBound_BelowZero() {

        int n = -100;

        try {
            convert(format(n));
        } catch (Exception e) {
            assertTrue(e.toString().contains("out of bound"));
        }
    }

}
