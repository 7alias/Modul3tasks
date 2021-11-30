import java.util.Scanner;

public class Task12email {


   public static void domain(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Input email:");
       String email = scanner.nextLine();
       System.out.println("Domain: " + mailBox(email));
}


    public static String mailBox(String a) {
        int indexAt = a.indexOf('@');
        String mailBox = a.substring(indexAt + 1);
        return mailBox;

    }
}
