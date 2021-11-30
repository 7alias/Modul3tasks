import java.util.Arrays;
import java.util.Scanner;

public class Task6String {

    public static void Kadabra() {
        Scanner scanner = new Scanner(System.in);
        String word = "Кадабра";
        while(true) {
            System.out.println("Enter 1 word: ");

            word = scanner.nextLine();
            if (word.contains(" ")) {

                System.out.println("More than 1 word");

            } else {


                char[] chars = word.toCharArray();
                char[] temp = new char[chars.length];

                int x = chars.length;
                for (int i = 0; i < chars.length; i++) {

                    x--;
                    temp[i] = chars[x];

                }
                word = Arrays.toString(temp);
                System.out.println(temp);
                break;
            }

        }
        //Слово наоборот -арбадак
    }
}
