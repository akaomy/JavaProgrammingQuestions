import org.junit.Assert;
import org.junit.Test;

/**
 * Created by abarabash on 4/6/16.
 */
public class SummarNumbers {

    public static int sumOfNumbers(String inputString){

        inputString = inputString.replaceAll("\\W", " ");

        int sum = 0;

        String[] arrayOfStrings = inputString.split("[^\\d.]");

        for(String each: arrayOfStrings){
            if(!each.equals("") && each != null) {
                sum+=Integer.parseInt(each);
            }
        }

        return sum;
    }


    @Test
    public void test0001(){

       String inputSting = "1a2b3c";

        Assert.assertEquals(6, sumOfNumbers(inputSting));
    }

    @Test
    public void test0002(){

        String inputSting = "123ab!45c";

        Assert.assertEquals(168, sumOfNumbers(inputSting));
    }

    @Test
    public void test0003(){

        String inputSting = "abcdef";

        Assert.assertEquals(0, sumOfNumbers(inputSting));
    }

    @Test
    public void test0004(){

        String inputSting = "0123.4";

        Assert.assertEquals(127, sumOfNumbers(inputSting));
    }

    @Test
    public void test0005(){

        String inputSting = "dFD$#23+++12@#T1234;/.,10";

        Assert.assertEquals(1279, sumOfNumbers(inputSting));
    }
}
