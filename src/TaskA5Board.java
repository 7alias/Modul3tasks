import java.util.Arrays;

public class TaskA5Board {
    public static short size = 9;
    public static String[][] strings;

    public static void board(int size) {
        strings = new String[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                strings[i][j] = (char) ('A' + j) + String.valueOf(size - i);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", strings[i]));
        }
    }
}
