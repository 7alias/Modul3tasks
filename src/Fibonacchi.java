import java.util.Arrays;

public class Fibonacchi {

    public static int[] numbers = new int[30];

    public static void numbers() {
        {
            numbers[0] = numbers[1] = 1;

            for (int i = 2, stop = numbers.length; i < stop; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }

            System.out.println(Arrays.toString(numbers));
        }
    }
}
