import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2630 {

    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        paper = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        String answer = recursion(1, n, 1, n);
        System.out.println(answer.chars()
                .filter(c -> c == '0')
                .count());
        System.out.println(answer.chars()
                .filter(c -> c == '1')
                .count());
    }

    private static String recursion (int starti, int endi, int startj, int endj) {
        if (starti == endi) {
            return String.valueOf(paper[starti][startj]);
        }

        int check = paper[starti][startj];

        for (int i = starti; i <= endi; i++) {
            for (int j = startj; j <= endj; j++) {
                if (paper[i][j] != check) {
                    return recursion(starti, (starti + endi) / 2, startj, (startj + endj) / 2)
                            + recursion((starti + endi) / 2 + 1, endi, startj, (startj + endj) / 2)
                            + recursion(starti, (starti + endi) / 2, (startj + endj) / 2 + 1, endj)
                            + recursion((starti + endi) / 2 + 1, endi, (startj + endj) / 2 + 1, endj);
                }
            }
        }

        return String.valueOf(check);
    }
}
