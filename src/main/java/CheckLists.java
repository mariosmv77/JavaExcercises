import java.math.BigInteger;
import java.util.*;

public class CheckLists {

    //Return List with only the prime numbers
    public static List<Integer> ListofPrimes(List<Integer> list) {
        List<Integer> listofPrimes = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (CalculateMethods.isPrime(list.get(i))) {
                listofPrimes.add(list.get(i));
            }
        }
        return listofPrimes;
    }

    //Return List with no Duplicates (I use Set because they are not allowed duplicates
    public static List<Integer> ListNoDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    // Return Digits of Number
    public static void PrintDigitsofNumber(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        int rev_num = 0;
        while (n != 0) {
            rev_num = n % 10;
            n = n / 10;
            digits.add(rev_num);
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.println(digits.get(i));
        }
    }

    //Reverse a string using only a stack
    public static void ReverseString(String str) {
        //int digits= str.length();
        List<String> listofdigits = RepresentStack.CreateStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            RepresentStack.PushInStack(str.charAt(i), listofdigits);
        }
        for (int i = listofdigits.size() - 1; i >= 0; i--) {
            RepresentStack.PopInStack(listofdigits);
        }
    }

    //Check if a String is symmetric
    public static void IsSymmetric(String str) {
        boolean flag = true;
        String strlowercase = str.toLowerCase();
        List<Character> listofString = new ArrayList<Character>(str.length());
        for (int i = 0; i < str.length(); i++) {
            listofString.add(strlowercase.charAt(i));
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (listofString.get(i) != listofString.get((str.length() - 1) - i)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The string is symmetric");
        } else {
            System.out.println("The string is not symmetric");
        }
    }

    //Add fuctionality for big numbers (Not working, my first try)
    public static void AddBigNumbers(long x, long y) {
        BigInteger bigNumber = new BigInteger(String.valueOf(x));
        BigInteger bigNumber1 = new BigInteger(String.valueOf(y));
        BigInteger num= bigNumber.add(bigNumber1);
        // To see clear the result
        System.out.println(num);

        //Try to depict with ArrayList
        BigInteger ten = new BigInteger("10");

        List<Integer> hugenumber = new ArrayList<Integer>();
        while (num.intValue()!=0) {
            BigInteger rev_num = num.mod(ten);
            int a = rev_num.intValue();
            num = num.divide(ten);
            hugenumber.add(a);
        }
        Collections.reverse(hugenumber);
        System.out.println(hugenumber);

        String outcome = "";
        for(int i =0; i< hugenumber.size();i++){
                outcome +=hugenumber.get(i);
              System.out.println(hugenumber.get(i) );
        }
        System.out.println(outcome);
    }

}
