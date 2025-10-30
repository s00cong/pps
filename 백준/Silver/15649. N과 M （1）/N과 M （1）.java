import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N+1];
        numbers = new int[M];
        // 순열
        Permutation(0);
        System.out.println(sb.toString());
    }

    static void Permutation(int cnt){
        if(cnt == M){
            for(int i = 0 ; i<M;i++){
                sb.append(numbers[i]+" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i<=N; i++){
            if(visited[i]) continue;
            numbers[cnt] = i;
            visited[i] = true;
            Permutation(cnt+1);
            visited[i] = false;
        }

    }
}
