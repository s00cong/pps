import java.util.Scanner;

public class Main {
    static int N,M;
    static int[] numbers;
    static int[] visited;
    public static void main(String[] args) {    //순열
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N+1];
        numbers = new int[M];
        dfs(0);
    }

    private static void dfs(int cnt){

        if(cnt == M){
            for (int i = 0; i < M; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i<=N; i++){
            if(visited[i]==1) continue;
            visited[i] = 1;
            numbers[cnt] = i;
            dfs(cnt+1);
            visited[i] = 0;
        }
    }
}
