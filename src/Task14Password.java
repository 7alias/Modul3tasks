import java.util.Scanner;

public class Task14Password {
/*
    Задание 14

    Проверка паролей:

    Принять пароль.
    Проверить, чтобы он не был похож на предыдущие. Если пароль был найден в массиве предыдущих паролей, то предложить ввести другой пароль.
    Проверить длину пароля (больше 8 символов). Если длина меньше 8 символов, то написать об этом и предложить ввести ещё раз.

    Если условия выполняются, написать «Security password verified success» и завершить программу.
  */

    public void passcheck() {
        String[] pass = new String[3];
        pass[0] = "123456";
        pass[1] = "000000";
        pass[2] = "0";
        Scanner scanner = new Scanner(System.in);
        String tempPass = "";

        while (true) {
        System.out.println("Enter password");
        tempPass = scanner.nextLine();
        for (int i = 0; i < pass.length; i++) {

                if (!pass[i].equals(tempPass)) {

                    System.out.println(tempPass + " " + i );
                    System.out.println("«Security password verified success»");
                    break;
                } else {

                    System.out.println("Password exists");
                    tempPass = scanner.nextLine();

                }

            } break;


        }

    }
}
