import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> q = new ArrayDeque<>();
        for(int i =1; i<=N; i++) q.offer(i);

        while(q.size()>1){
            q.poll();
            int n = q.poll();
            q.add(n);
        }
        System.out.println(q.peek());
        
    }
}
