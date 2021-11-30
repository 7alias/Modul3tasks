import java.util.Arrays;

public class TaskA5Board {

    public static void board(int size) {


        String [] c = {"A", "B", "C", "D"};
String [] line = new String[size];
        String fields[][] = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                String temp = c[j] + size;
                size -= i;
               line [j] = c[i] + size;
               fields[i][j]= line[j];
            }
            System.out.println(Arrays.toString(fields[i]));
        }


            /*
            A4 B4 C4 D4
                A3 B3 C3 D3
                A2 B2 C2 D2
                A1, B1, C1, D1
*/

    }
}