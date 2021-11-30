public class Task7Massive {

    public static void Massive() {

        String[] a = {"Каждый ", "охотник ", "желает " , "знать "};
//выводим начальный массив в консоль
        for (String s : a) {
            System.out.print(s);
        }
        System.out.println();
        int n = a.length;
        // переменная, которая будет использоваться при замене элементов
        String temporary;

        for (int i = 0; i < n / 2; i++) {
            temporary = a[n - i - 1];
            // n-i-1 формула для определения противоположного элемента массива
            a[n - i - 1] = a[i];
            a[i] = temporary;


        }
//выводим измененный массив в консоль
        for (String s : a) {
            System.out.print(s);
        }

    }
}