import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class B26004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String Emoji = br.readLine();
        int[] c = new int[5];

        for (int i = 0; i < n; i++) {
            switch (Emoji.charAt(i)) {
                case 'H':
                    c[0]++;
                    break;
                case 'I':
                    c[1]++;
                    break;
                case 'A':
                    c[2]++;
                    break;
                case 'R':
                    c[3]++;
                    break;
                case 'C':
                    c[4]++;
                    break;
            }
        }

        System.out.println(Arrays.stream(c).min().getAsInt());

        br.close();
    }
}
