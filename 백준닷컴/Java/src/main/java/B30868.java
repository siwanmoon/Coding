import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B30868 {
    public static String countVote(int i) {
        StringBuilder sb = new StringBuilder();

        while (i >= 5){
            sb.append("++++ ");
            i -= 5;
        }

        while (i > 0){
            sb.append("|");
            i -= 1;
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(countVote(Integer.parseInt(br.readLine())))
                    .append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
