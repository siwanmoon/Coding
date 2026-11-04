import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.printf("%d %d", (n / 100) * 78, (n / 1000) * 956);

        br.close();
    }
}
