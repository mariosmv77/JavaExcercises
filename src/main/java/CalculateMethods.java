import java.math.BigDecimal;

public class CalculateMethods {
    //Calculate factorial
    public static int calcfactorial(int n) {
        int returnValue = 1;
        for (int i = 1; i <= n; i++) {
            returnValue *= i;
            System.out.println(i + returnValue);
        }
        return returnValue;
    }

    //Max int can calculate the var int
    public static int calcMaximum(int n) {
        int max = Integer.MAX_VALUE; // 2 eis tin 31 meion 1
        System.out.println(max);
        System.out.println(max + 1);

        return 0;
    }

    //Return if a number is Prime or not
    public static boolean isPrime(int n) {
        boolean flag = true;
        //int upto = (int) (Math.sqrt(n) + 1);
        if (n == 2) {
            flag = true;
        } else if (n % 2 == 0) {
            flag = false;
        } else {
            for (int j = 3; j < n / 2; j += 2) {
                if (n % j == 0)
                    flag = false;
            }
        }
        return flag;
    }

    public static double harmonicSum(int n) {
        double returnValue = 0;
        for (int i = 1; i <= n; i++) {
            returnValue += 1 / (double) i;
        }
        return returnValue;
    }

    //Calculate the digits of a long number
    public static int CalculateDigits(long x) {
        int numberofdigits = 0;
        while (x != 0) {
            x = x / 10;
            numberofdigits++;
        }
        return numberofdigits;
    }

    //Calculate the demical part of a number
    public static float GiveDemicalPart(float number) {
        BigDecimal floatNumber = new BigDecimal(String.valueOf(number));
        BigDecimal integerNumber = new BigDecimal(floatNumber.intValue());
        return floatNumber.subtract(integerNumber).floatValue();
    }

}
