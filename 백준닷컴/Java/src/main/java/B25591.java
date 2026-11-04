import java.util.Scanner;

public class B25591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int a = 100 - n;
        int b = 100 - m;
        int c = 100 - a - b;
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
        System.out.printf("%d %d", c + q, r);
    }
}