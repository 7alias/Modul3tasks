import java.util.Locale;
import java.util.Scanner;

public class Task8Story {

    public static void story() {
        String story = "    Жили-были старик со старухой.    Вот и говорит старик старухе:" +
                "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";

// Создать программу, которая будет выводить меню, где можно редактировать текст и считать количество символов


        Scanner scanner = new Scanner(System.in);
        int x = 1;
        System.out.println("Сказка такая:");
        System.out.println(story);
        while (x != 0) {

            System.out.println("Что изволите сделать? ");
            System.out.println("1. Удалить пробелы");
            System.out.println("2. Сделать все буквы заглавными");
            System.out.println("3. Сделать все буквы строчными");
            System.out.println("4. Посчитать количество символов");
            System.out.println("5. Вернуть обратно как было");
            System.out.println("0: Выход");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    story = story.replace(" ", "");
                    System.out.println(story);
                    continue;
                case 2:
                    story = story.toUpperCase();
                    System.out.println(story);
                    continue;
                case 3:
                    story = story.toLowerCase();
                    System.out.println(story);
                    continue;
                case 4:
                    int count = story.length();
                    System.out.println("Количество символов: " + count);
                    continue;
                case 5:
                    story = "    Жили-были старик со старухой.    Вот и говорит старик старухе:" +
                            "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";
                    continue;
                default:
                    break;
            }
            break;
        }
    }
}

