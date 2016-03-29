package Day1;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by abarabash on 3/29/16.
 */
public class CheckIfPolyndrom {

    private boolean isPolyndromRecursion(String string) {
        if (string.length() == 0 || string.length() == 1)
            return true;

        if (string.charAt(0) == string.charAt(string.length() - 1))
            return isPolyndromRecursion(string.substring(1, string.length() - 1));

        return false;
    }

    public static String reverse(String string){
        String str =  "";
        for(int i = string.length() - 1; i >= 0; i--){
            str+=string.charAt(i);
        }
        return str;
    }

    public static Boolean isPolyndrom(String string){
        String reverted = reverse(string);
        return string.equals(reverted);
    }

    @Test
    public void test001(){
        String first = "123454321";
        Assert.assertTrue(isPolyndrom(first));
    }

    @Test
    public void test002(){
        String first = "12345431";
        Assert.assertTrue(isPolyndrom(first));
    }

}
