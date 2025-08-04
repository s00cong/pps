import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[]numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();    
        }
        Arrays.sort(numbers);
        x = sc.nextInt();
        int right = n-1;
        int left = 0;
        int sum = 0;
        int result = 0;

        while(left < right){
            sum = numbers[left]+numbers[right];
            if(sum==x){
                result++;
                left++;
                right--;
            }
            else if(sum<x){
                left++;
            }
            else right--;
        }
        System.out.println(result);

    }
}
