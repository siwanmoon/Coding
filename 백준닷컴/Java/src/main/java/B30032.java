import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B30032 {
    public static String updown (String alphabet) {
        char[] temp = alphabet.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            switch (temp[i]) {
                case 'd':
                    temp[i] = 'q';
                    break;
                case 'b':
                    temp[i] = 'p';
                    break;
                case 'q':
                    temp[i] = 'd';
                    break;
                case 'p':
                    temp[i] = 'b';
                    break;
            }
        }

        return String.valueOf(temp);
    }

    public static String leftright (String alphabet) {
        char[] temp = alphabet.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            switch (temp[i]) {
                case 'd':
                    temp[i] = 'b';
                    break;
                case 'b':
                    temp[i] = 'd';
                    break;
                case 'q':
                    temp[i] = 'p';
                    break;
                case 'p':
                    temp[i] = 'q';
                    break;
            }
        }

        return String.valueOf(temp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            if(d == 1) {
                sb.append(updown(br.readLine())).append("\n");
            } else {
                sb.append(leftright(br.readLine())).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
