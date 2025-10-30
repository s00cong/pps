import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] tree;
    int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        tree = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree);
        System.out.println(upperBound(M)-1);

    }

    static int upperBound(int key){
        int lo = 0;
        int hi = tree[tree.length-1];
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            long sum = 0;
            for(int i = 0; i<N; i++){
                int temp = tree[i] - mid;
                if(temp>0){
                    sum+=temp;
                }
            }
            if(sum>=key) {
                lo = mid + 1;
            }
            else hi = mid;
            
        }
        return lo;
    }

}

