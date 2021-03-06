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

    public static void setPass() {
        Task14Password pass = new Task14Password();
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isCorrect = true;
        do {

            System.out.println("enter pass:");
            password = scanner.nextLine();
            if (pass.passCheck(password) == false) {
                System.out.println("Incorrect");
                continue;
            } else {
                System.out.println("«Security password verified success»");
                System.out.println("New password: " + password);
                break;
            }
        }
        while (isCorrect);


    }

    public boolean passCheck(String password) {
        String[] pass = new String[3];
        pass[0] = "123456789";
        pass[1] = "000000000";
        pass[2] = "654321654";

        for (int i = 0; i < pass.length; i++) {
            if (password.length() < 8 || password.equals(pass[i])) {
                return false;
            }
        }
        return true;
    }
}