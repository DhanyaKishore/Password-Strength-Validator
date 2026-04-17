import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("\nNo. of characters>=8");
            System.out.println("Uppercase Letter available");
            System.out.println("Digit available");
            System.out.println("Special Character present\n");
            System.out.println("Password is VALID");
        } else {
            System.out.println("\nPassword is INVALID");
        }

        sc.close();
    }

    public static boolean isValidPassword(String password) {
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasDigit && hasSpecial;
    }

}
