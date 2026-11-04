import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("Naver ");
        char c = br.readLine().charAt(0);

        if (c == 'N' || c =='n') {
            sb.append("D2");
        } else {
            sb.append("Whale");
        }

        System.out.println(sb);
        br.close();
    }
}
