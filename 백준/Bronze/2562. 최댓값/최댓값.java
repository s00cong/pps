import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int max_idx = 0;
        int max = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=9; i++){
            temp = sc.nextInt();
            if(max<temp){
                max = temp;
                max_idx = i;
            }

        }

        System.out.println(max+"\n"+max_idx);

        
    }
}