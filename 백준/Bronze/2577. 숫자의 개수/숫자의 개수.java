import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        Scanner sc = new Scanner(System.in);
        int inputs = 0;
        int mux = 1;
        for(int i = 0; i<3;i++){
            inputs= sc.nextInt();
            mux *=inputs;
        }
        String temp = Integer.toString(mux);

        for(char c : temp.toCharArray()){
            numbers[ c-'0']++;
        }
        for(int a : numbers)
            System.out.println(a+" ");

    }
}