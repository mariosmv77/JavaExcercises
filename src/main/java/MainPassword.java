import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        System.out.print("Enter a password : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        //CheckStringsMethods.CheckPassword(inputString);
        System.out.println(CheckStringsMethods.CheckSequence(inputString));
    }
}
