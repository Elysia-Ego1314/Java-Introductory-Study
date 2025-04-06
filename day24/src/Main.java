
public class Main {
    public static void main(String[] args) {
        long n = 2021041820210418L;
        int sum = 0;
        for (long i = 1L;i<n;i++) {
            for (long j = 1L;j<n;j++) {
                if (n%(i*j)==0) {
                    sum++;
                }
                if ((i*j)>n) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}