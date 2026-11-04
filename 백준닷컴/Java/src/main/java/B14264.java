import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B14264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double L = Integer.parseInt(br.readLine());
        System.out.println(L * L * Math.sqrt(3) / 4);

        br.close();
    }
}
