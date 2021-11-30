import java.util.Scanner;

public class Task2UserPassword {

    public static void userPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        System.out.println(userName);
        boolean goodPass = false;
        while (goodPass == false) {
            System.out.println("Enter password 8 to 15 symbols:");
            String password = scanner.nextLine();
            if (password.length() >= 8 && password.length() <= 15) {
                goodPass = true;
                System.out.println(password);
                break;
            } else {
                System.out.println("Wrong password, Please try again");

            }
        }
    }
}