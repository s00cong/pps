
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;   // # of node
    static ArrayList<int[]> list[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        for(int i = 0 ; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            int a = left - 'A';
            int b = right - 'A';
            if(left =='.'){
                a = -1;
            }
            if(right == '.'){
                b = -1;
            }
            list[root-'A'].add(new int[]{a,b});
        }
        preorder(0);
        sb.append('\n');
        inorder(0);
        sb.append('\n');
        postorder(0);

        System.out.println(sb);

    }

    static void preorder(int node){
        if(node == -1) return;
        sb.append((char)(node+'A'));
        preorder(list[node].get(0)[0]); //left
        preorder(list[node].get(0)[1]); //right
    }

    static void inorder(int node){
        if(node == -1) return;
        inorder(list[node].get(0)[0]); //left
        sb.append((char)(node+'A'));
        inorder(list[node].get(0)[1]); //right
        
    }

    static void postorder(int node){
        if(node == -1) return;
        postorder(list[node].get(0)[0]); //left
        postorder(list[node].get(0)[1]); //right
        sb.append((char)(node+'A'));
    }

}
