package demo1;

public class test2 {
    public static void main(String[] args) {
        double[] a = new double[]{12.9,53.54,75,99.1,3.14};
        double min = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
