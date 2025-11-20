
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,K;// k: 하루에 감소하는 중량 수
    static int[] A;
    static int ans;
    static boolean[] selected;
    //순열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = new int[N+1];
        selected = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Perm(0,500);
        System.out.println(ans);

    }
    static void Perm(int cnt, int exercise){

        if(exercise <500){
            return;
        }
        if(cnt==N){
            ans++;
            return;
        }

        for(int i = 1; i<=N; i++){
            if(selected[i]) continue;
            selected[i] = true;
            Perm(cnt+1, exercise-K+A[i]);
            selected[i] = false;
        }

    }
}