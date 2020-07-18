import java.util.ArrayList;
import java.util.List;

public class MainCollections {
    public static void main(String[] args) {

        //Check my code about List with only primes
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i<=20;i++){
            numbers.add(i);
        }

        numbers =CheckLists.ListofPrimes(numbers);
        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        // Check my code about duplicates
        List<Integer> numbers1 = new ArrayList<Integer>();
        for(int i=0; i<=20;i++){
            numbers1.add(i);
        }
        numbers1.add(1);
        numbers1.add(3);

        numbers1 =CheckLists.ListNoDuplicates(numbers1);
        for(int i=0; i<numbers1.size();i++){
            System.out.println(numbers1.get(i));
        }

        //Check my code for print digits o number
        int num = 12345;
        CheckLists.PrintDigitsofNumber(num);

        //Check my code for symmetric string
        CheckLists.IsSymmetric("Abcba");
    }
}
