import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B25704 {
    public static int Payment(int N, int P) {
        int minPayment = P;

        if (N >= 5) {
            minPayment = Math.min(minPayment, P - 500);
        } if (N >= 10) {
            minPayment = Math.min(minPayment, P * 9 / 10);
        } if (N >= 15) {
            minPayment = Math.min(minPayment, P - 2000);
        } if (N >= 20) {
            minPayment = Math.min(minPayment, P * 3 / 4);
        } if (minPayment < 0) {
            minPayment = 0;
        }

        return  minPayment;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        System.out.println(Payment(N, P));
    }
}
