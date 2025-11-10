
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] A;
    static Stack<Integer> stack = new Stack<>();
    static int[] answers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        answers = new int[N];
        st = new StringTokenizer(br.readLine()); 
        for(int i = 0; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                answers[stack.pop()] = A[i];
            }
            stack.add(i);
        }
        while(!stack.isEmpty()){
            answers[stack.pop()] = -1;
        }
        for(int a : answers){
            sb.append(a).append(" ");
        }
        System.out.println(sb.toString());

    }
}
