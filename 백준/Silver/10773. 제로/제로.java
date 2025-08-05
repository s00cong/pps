
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 0;
        int sum = 0;
        while(N-- >0){
            temp = sc.nextInt();
            if(temp!=0){
                st.push(temp);
                sum+=temp;
            }
            else {
                sum-=st.peek();
                st.pop();
            }
        }
        System.out.println(sum);
        
    }
}
