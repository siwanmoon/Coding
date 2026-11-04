import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B4892 {
    public static String getN1(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int getN4(int n) {
        n *= 3;
        n = (n + 1) / 2;
        n *= 3;
        return n / 9;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int CaseNumber = 1;

        while (true) {
            int n0 = Integer.parseInt(br.readLine());

            if (n0 == 0) {
                break;
            } else {
                sb.append(CaseNumber + ". ")
                        .append(getN1(n0) + " ")
                        .append(getN4(n0) + "\n");
            }

            CaseNumber++;
        }

        System.out.println(sb);

        br.close();
    }
}
