import java.util.Arrays;

public class Task3Massive {
    public static void competition() {
/*
        Прошло соревнование среди 5 участников: Саша, Игорь, Миша, Коля и Владимир, по 5 различным дисциплинам.
        Организаторами был создан двухмерный массив: каждая i-ая строка — это количество полученных баллов i-го игрока.
            Задание: вывести одномерный массив в виде "<Имя игрока>  <сумма баллов>".
 */
        String[] names = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] points = {
                {1, 5, 6, 7, 8},
                {3, 5, 6, 7, 8},
                {3, 5, 6, 7, 8},
                {3, 5, 6, 7, 8},
                {1, 1, 1, 1, 1}
        };
        int[] sum = new int[points.length];
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < points.length; j++) {
                sum [i] +=points[i][j];
            }
            System.out.print(names[i] + " ");
            System.out.println(sum[i]);
        }
    }
}
