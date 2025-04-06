public class Main {
    public static void main(String[] args) {
        long sum = 0;
        long fang = 1;
        for (int i = 0;i<64;i++) {
            sum+=fang;
            fang = fang*2;
        }
        System.out.println(sum);
    }
}