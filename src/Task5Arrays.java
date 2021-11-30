import java.util.Arrays;

public class Task5Arrays {


    public static void Task5() {


        double[] x = {1, 2, 3};
        double sum = 0;
        double max = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                System.out.println(x[i] + " " + max);
                max = x[i];
                System.out.println(x[i] + " " + max);
            }

            sum += x[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println("Array max = " + max);
        System.out.println("Summ: " + sum);

/*        Создайте в методе цикл, который будет выводить в консоль все элементы массива.
                Напишите к нему цикл, способный считать сумму всех элементов, чтобы в консоль выводилось: "Сумма чисел массива: ".
                Найдите в своем массиве наибольший элемент и выведите его в консоль: "Наибольший элемент: ".

*/

    }
}
