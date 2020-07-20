public class Main {

    public static void main(String[] args) {
        //Test my methods from CalculateMethods class
        int number =10;
        System.out.println(CalculateMethods.calcfactorial(number));

        int number2 =10;
        System.out.println(CalculateMethods.harmonicSum(number2));

        System.out.println(CalculateMethods.calcMaximum());

        int number3 = 14;
        System.out.println(CalculateMethods.isPrime(number3));

        long longnumber = 1234567890;
        System.out.println("The number 123456789 has " + CalculateMethods.CalculateDigits(longnumber) + " digits");

        float number4 = 2.31f;
        System.out.println(CalculateMethods.GiveDemicalPart(number4));
    }
}

