
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        make();
        StringTokenizer st ;
        
        for(int i = 0 ; i <N-2; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }
        int a = -1;
        int b = -1;
        for(int i =1; i<=N; i++){
            int r = find(i);
            if(a == -1) a = r;
            else if(a !=r ){
                b = r;
                break;
            }
        }
        System.out.println(a+" " + b);


    }
    static void make(){
        for(int i = 1; i<=N; i++){
            parent[i] = i;
        }
    }

    static int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a == b)
            return;
        
        parent[b] = a;
    }

}
