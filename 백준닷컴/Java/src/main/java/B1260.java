import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {

    static boolean[] visitied;
    static boolean[][] line;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        line = new boolean[n + 1][n + 1];
        visitied = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            line[a][b] = true;
            line[b][a] = true;
        }

        DFS(v, sb);
        sb.append("\n");
        visitied = new boolean[n + 1];
        BFS(v, sb);

        System.out.println(sb);
    }

    private static void DFS(int v, StringBuilder sb) {
        visitied[v] = true;
        sb.append(v).append(" ");

        for (int i = 1; i <= n; i++) {
            if (line[v][i] && !visitied[i]) {
                DFS(i, sb);
            }
        }
    }

    private static void BFS(int v, StringBuilder sb) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);

        while (!que.isEmpty()) {
            int node = que.remove();

            if (visitied[node]) {
                continue;
            } else {
                visitied[node] = true;
                sb.append(node).append(" ");
            }

            for (int i = 1; i <= n; i++) {
                if (line[node][i] && !visitied[i]) {
                    que.add(i);
                }
            }
        }
    }
}
