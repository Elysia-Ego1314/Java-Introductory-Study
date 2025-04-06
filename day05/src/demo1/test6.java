package demo1;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[] list1 = new int[]{12,14,23,45,66,68,70,77,90,91};
        int[] list2 = new int[11];
        int wei = 0;
        Scanner a = new Scanner(System.in);
        int shu = a.nextInt();
        for (int i = 0; i < list1.length; i++) {
            if (shu > list1[i]) {
                wei = i;
                break;
            }
        }
        for (int i = 0; i < wei; i++) {
            list2[i] = list1[i];
        }
        list2[wei] = shu;
        for (int i = wei+1; i < list1.length+1; i++) {
            list2[i] = list1[i-1];
        }
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }
}
