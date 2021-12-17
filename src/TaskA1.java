import java.util.Arrays;
public class TaskA1 {



        public static int[] numbers = new int[100];

        public static void numbers() {
            numbers[0] = 1;

            for (int i = 1, stop = numbers.length; i < stop; i++) {
                numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + (i+1)));
            }

            System.out.println(Arrays.toString(numbers));
        }
    }

