import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (isValidPassword(input)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        int digitCount = 0;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        
        return digitCount >= 2;
    }
}