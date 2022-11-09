package replits;

import kotlin.text.StringsKt;

import java.util.Arrays;

public class Increment {
    public static void main(String[] args) {
        int a = 0;
        do {
            a = a++ + --a - (a % 3);
        } while (++a < 4);
        System.out.println(a);
        System.out.println("-------------------------");
        String str = "The whole time it was raining.";
        do {
            System.out.println(str.charAt(0));
            str = str.substring(3);
        } while (!str.isEmpty());
        System.out.println("-------------------------");
        String str1 = "cybertek";
        for (int i = 0; i < str1.length(); i += 2) {//<= olduğunda hata verir.
            System.out.println(str1.charAt(i));
        }
        System.out.println("-------------------------");
        int number = 5;
        while (number < 100) {
            number += number;
        }
        System.out.println(number);
        System.out.println("-------------------------");
        int[] nums = new int[5];
        int x = 5;
        nums[2] = x--;
        nums[0] = x * 2;
        nums[4] = --x + (x - 9);
        nums[1] = nums[2];
        nums[3] = nums[x - 3];
        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------------");
        String[] strs = {"ali", "ahmet", "selami", "kasap", "dede"};
        int m = strs.length;
        int n = strs[4].length();//indeks 5 olduğunda hata verir.
        System.out.println(m + " " + n);
        System.out.println("-------------------------");
        double[] doub = new double[4];
        doub[0] = 12.8;
        doub[2] = 9.7;
        doub = new double[4];
        doub[1] = 89.5;
        doub[3] = 13.1;
        System.out.println(Arrays.toString(doub));
    }
}