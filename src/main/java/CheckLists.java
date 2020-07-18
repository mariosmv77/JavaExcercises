import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public static void PrintDigitsofNumber(int n){
        List<Integer> digits = new ArrayList<Integer>();
        int rev_num=0;
        while(n!=0) {
            rev_num = n % 10;
            n = n / 10;
            digits.add(rev_num);
        }
        for (int i=digits.size()-1; i>=0 ; i--){
            System.out.println(digits.get(i));
        }
    }

    //Reverse a string using only a stack
    public static void ReverseString(String str){
        //int digits= str.length();
        List<String> listofdigits = RepresentStack.CreateStack(str.length());
        for (int i=0; i<str.length();i++) {
            RepresentStack.PushInStack(str.charAt(i), listofdigits);
        }
        for(int i= listofdigits.size()-1; i>=0 ;i--){
            RepresentStack.PopInStack(listofdigits);
        }
    }

    }
