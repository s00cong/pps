import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int N = Integer.parseInt(br.readLine());
        int[] heights = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        //높이 입력 받기
        for (int i = 1; i <= N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=N; i++){
            int curHeight = heights[i];

            while(!stack.isEmpty()&&stack.peek()[1]<curHeight){
                stack.pop();
            }
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            else{
                sb.append(stack.peek()[0]).append(" ");
            }
            
            stack.push(new int[]{i, curHeight}); 

        }

        System.out.println(sb.toString());
       

    }
}