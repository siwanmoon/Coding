import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1012 {
    static Queue<Node> que = new LinkedList<>();

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] cabbageField = new int[m][n];

            while (k-- > 0) {
                st = new StringTokenizer(br.readLine());
                cabbageField[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            Queue<Integer> queue = new LinkedList<>();
            int result = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (cabbageField[i][j] == 1) {
                        result++;
                        cultivation(cabbageField, i, j);
                    }
                }
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static void cultivation (int[][] cabbageField, int i, int j) {
        que.add(new Node(i, j));

        while(!que.isEmpty()) {
            Node node = que.remove();
            i = node.x;
            j = node.y;
            cabbageField[i][j] = 0;

            if (i < cabbageField.length - 1 && cabbageField[i + 1][j] == 1) {
                que.add(new Node(i + 1, j));
                cabbageField[i + 1][j] = 0;
            }

            if (j < cabbageField[i].length - 1 && cabbageField[i][j + 1] == 1) {
                que.add(new Node(i, j + 1));
                cabbageField[i][j + 1] = 0;
            }

            if (i > 0 && cabbageField[i - 1][j] == 1) {
                que.add(new Node(i - 1, j));
                cabbageField[i - 1][j] = 0;
            }

            if (j > 0 && cabbageField[i][j - 1] == 1) {
                que.add(new Node(i, j - 1));
                cabbageField[i][j - 1] = 0;
            }
        }
    }
}
