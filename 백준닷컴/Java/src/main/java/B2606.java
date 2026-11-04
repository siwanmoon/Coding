import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2606 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerNumber = Integer.parseInt(br.readLine());
        boolean[] computersInfected = new boolean[computerNumber + 1];
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= computerNumber; i++) {
            graph.add(new ArrayList<>());
        }

        int graphLength = Integer.parseInt(br.readLine());

        for (int i = 0; i < graphLength; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());;

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        computersInfected[1] = true;
        virusInfection(1, computersInfected, graph);
        int result = 0;

        for (int i = 2; i < computersInfected.length; i++) {
            if(computersInfected[i]) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static void virusInfection(int computerIndex, boolean[] computersInfected, List<List<Integer>> graph) {
        for (int connectedComputerIndex : graph.get(computerIndex)) {
            if (!computersInfected[connectedComputerIndex]) {
                computersInfected[connectedComputerIndex] = true;
                virusInfection(connectedComputerIndex, computersInfected, graph);
            }
        }
    }
}
