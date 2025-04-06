import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++) {
            int result = jie(i);
            sum += result;
        }
        String s = "asdf";
        boolean flag = s.equals("asdf");
        System.out.println(sum);
    }
    public static int jie(int n) {
        int sum = 1;
        for (int i = 1;i<=n;i++) {
            sum *= i;
        }
        return sum;
    }
}