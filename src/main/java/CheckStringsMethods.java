import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckStringsMethods {

    public static boolean CheckUpperCase(String x) {
        String pattern = "((?s).*[A-Z].*)";
        return x.matches(pattern);
    }

    public static boolean CheckLowerCase(String x) {
        String pattern = "((?s).*[a-z].*)";
        return x.matches(pattern);
    }

    public static boolean CheckExistofNumbers(String x) {
        String pattern = "((?s).*[0-9].*)";
        return x.matches(pattern);
    }

    public static boolean CheckExistofSymbols(String x) {
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(x);
        return hasSpecial.find();
    }

    public static boolean CheckNumberofCharacters(String x) {
        return x.length() >= 8;
    }

    public static boolean CheckSequence(String x) {
        return !x.matches("[a-z]{2,}|[A-Z]{2,}|\\d{2,}");

    }

    public static int CheckPasswordRequirements(String x) {
        int sum = 0;
        if (CheckExistofNumbers(x)) sum++;
        if (CheckLowerCase(x)) sum++;
        if (CheckUpperCase(x)) sum++;
        if (CheckSequence(x)) sum++;
        if (CheckExistofSymbols(x)) sum++;
        if (CheckNumberofCharacters(x)) sum++;
        return sum;
    }

    public static void CheckPassword(String x) {
        if (CheckPasswordRequirements(x) >= 3) {
            if (CheckPasswordRequirements(x) == 6) {
                System.out.println("Very Strong Password");
            } else if (CheckNumberofCharacters(x)) {
                if ((CheckExistofNumbers(x) && CheckSequence(x)) || (CheckExistofSymbols(x) && CheckSequence(x))) {
                    System.out.println("Password OK, Strong Password");
                }
            }
        } else {
            System.out.println("Invalid Password");
            System.out.println("Password Requirements: \n1.Password contains at least one uppercase character \n" +
                    "2. Password contains at least one lowercase character \n"
                    + "3. Contains at least one number \n"
                    + "4. Contains at least one special character (e.g., !, _ etc) \n"
                    + "5. Password length must be at least 8 characters long \n"
                    + "6. Cannot contain a sequence of 3 same characters (e.g., aaa) or a sequence of 3 consecutive characters (e.g., abc)");
        }
    }

}


