import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int max;
    static int[] nums;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        nums = new int[N];
        int temp = 0;
        st = new StringTokenizer(br.readLine());
        
        // 모든 온도 데이터
        for(int i = 0 ; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 첫 K개의 합 계산
        for(int i = 0; i < K; i++){
            temp += nums[i];
        }
        max = temp;

        // 슬라이딩 윈도우: 한 칸씩 이동하면서 최댓값 갱신
        for(int i = K; i < N; i++){
            temp = temp - nums[i - K] + nums[i];  // 맨 앞 빼고, 새로운 값 더하기
            max = Math.max(max, temp);
        }

        System.out.println(max);
    }
}