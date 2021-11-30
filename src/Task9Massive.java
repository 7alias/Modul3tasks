import java.util.Arrays;

public class Task9Massive {

    public static void numsSort() {


        int[] nums = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
x--;
            System.out.print(nums[x] + " ");


        }
        Arrays.sort(nums);
        String arr = Arrays.toString(nums);
        System.out.println();
        System.out.println(arr);
        //Вывести его в обратном порядке. Затем отсортировать в порядке убывания.
    }
}
