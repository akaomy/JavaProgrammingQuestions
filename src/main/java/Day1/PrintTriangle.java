package Day1;

import org.junit.Test;

/**
 * Created by abarabash on 3/29/16.
 */
public class PrintTriangle {

    public static void printTriRecursion(int currHeight, int height) {

        if (currHeight == 1) {
            printSpaces(currHeight);
            printDots(height - currHeight);
        } else {

            printSpaces(currHeight);
            printDots(height - currHeight);

            printTriRecursion(currHeight - 1, height);
        }
    }

    public static void printTriangle(int height) {

        for (int i = 0; i < height; i++) {
            printSpaces(height - i);
            printDots(i);
        }
    }

    public static void printSpaces(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(" ");
        }
    }

    public static void printDots(int dots) {
        for (int i = 0; i <= dots; i++) {
            System.out.print(". ");
        }
        System.out.print("\n");
    }


    @Test
    public void test001() {
        printTriangle(4);
    }

    @Test
    public void test002() {
        printTriRecursion(5, 5);
    }


}


