package demo1;
import java.util.Random;
public class test7 {
    public static void main(String[] args) {
        int[] list = new int[23];
        Random r = new Random();
        for (int i = 0; i < 23; i++) {
            list[i] = r.nextInt(100);
            System.out.print(list[i] + " ");
        }
        int ji = 0;
        for (int i = 0; i < 23; i++) {
            if (list[i] % 2 == 1) {
                ji++;
            }
        }
        System.out.println("\n" + ji);
        int temp;
        for (int i = 0; i <ji; i++) {
            if (list[i] % 2 == 0) {
                temp = list[i] ;
                for (int j = ji; j< list.length; j++) {
                    if (list[j] % 2 == 1) {
                        list[i] = list[j];
                        list[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 23; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
