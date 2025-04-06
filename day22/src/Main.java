import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 0;i<22;i++) {
            sum = sum*20;
            sum = sum%7;
        }
        System.out.println(sum);
    }
}