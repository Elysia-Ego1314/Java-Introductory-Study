package demo1;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        int[] list = new int[6];
        Random  r = new Random();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            list[i] = r.nextInt(100);
            sum+=list[i];
        }
        System.out.println(sum);
    }
}
