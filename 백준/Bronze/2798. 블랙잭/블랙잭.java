import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M,best = 0;
    static int[] cards;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cards = new int[N];
        for(int i = 0 ; i <N; i++) cards[i] = Integer.parseInt(st.nextToken());
        
        //M을 넘지않으면서  M에 최대한 가까운 카드!
        int maxSum = 0;
        for(int i = 0; i<N-2; i++){
            for(int j = i+1; j<N-1;j++){
                for(int k = j+1; k<N; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <=M && sum>maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }

    
}
