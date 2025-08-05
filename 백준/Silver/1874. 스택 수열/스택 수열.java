
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        Stack<Integer> stack = new Stack<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        boolean isPossible = true;
        int num = 1;
        while(N-- >0){
            int target = Integer.parseInt(br.readLine());

            while(num <= target){
                stack.push(num++);
                sb.append("+\n");
            }

            if(stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            }
            else{
                isPossible=false;
                break;
            }
        }
        if(isPossible) System.out.println(sb);
        else System.out.println("NO");
        
    }
}
