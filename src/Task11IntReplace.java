import java.util.Scanner;

public class Task11IntReplace {

 public static void replaceInt(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5");
    String ocenkiMoi = scanner.nextLine();
    String otlichnik = ocenkiMoi.replaceAll( "2","5");
        System.out.println(otlichnik);
}
}


