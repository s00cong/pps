import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N,S;
    // 가장 짧은 것의 길이를 구하기
    static int min = Integer.MAX_VALUE;
    // 연속된 수여야한다.
    static int[] numbers;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int start, end = 0;
        sum = numbers[0] ;
        
        for(start = 0 ; start<N; start++){
            while(end<N && sum<S) {
                end++;
                if(end!= N)
                    sum+=numbers[end];
                
            }
            if(sum >= S){
                min = Math.min(min, end - start + 1);   // sum 말고 길이 비교
            }

            sum -= numbers[start];
        }
            System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }   
}