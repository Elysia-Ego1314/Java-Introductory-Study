package demo1;

public class test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
        }
        System.out.println(sum);
    }
}
