import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Test my methods
        int number1 = 14;
        System.out.println(CalculateMethods.isPrime(number1));

        long longnumber = 1234567890;
        System.out.println("The number 123456789 has " + CalculateMethods.CalculateDigits(longnumber) + " digits");

        float number = 2.31f;
        System.out.println(CalculateMethods.GiveDemicalPart(number));
    }
}

