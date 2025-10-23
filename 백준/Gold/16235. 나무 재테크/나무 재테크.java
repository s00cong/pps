import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[][] food;    //양분
    static int N,M,K;
    static int[] dr = {-1,-1,-1,0,0,1,1,1};
    static int[] dc = {-1,0,1,-1,1,-1,0,1};
    static int[][] A;   // 겨울 양분!
    static ArrayList<Tree>trees = new ArrayList<>();
    static class Tree implements Comparable<Tree> {
        int age;
        int r,c;
        boolean alive;
        Tree(int r, int c, int age) {
            this.r = r;
            this.c = c;
            this.age = age;
        }
        
        @Override
        public int compareTo(Tree o) {
            return this.age - o.age;
        }
    }
    
    // 모든 양분은 처음에 5만큼 들어 있음
;
    // 봄 : 자신의 나이만큼 양분을 먹고 나이 1 증가, (여러 나무가 들어있다면 나이가 어린 나무부터 양분을 먹음.)
    //      만약 나이만큼 못먹으면 나무는 죽음
    // 여름 : 죽은 나무가 양분으로 변함. (나이/2의 값이 양분으로 변함 -> 소수점 아래는 버림)
    // 가을 : 번식! 나무의 나이가 5의 배수여야함. 인업 8칸에 나무 생김(나이는 1).
    // 겨울 : 땅에 양분을 추가 (A[r][c]의 값을 더함);
    // 나무가 가져야하는 변수 : 나이, 양분, 살았는지 죽었는지, 현재의 위치?
    // 땅이 가져야하는 값 : 양분, 나무의 개수(list로?),
    // k년이 지난 후의 나무의 개수구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n : map크기, m : 심은 나무의 개수 k: 구해야하는거

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        //A[][]의 값
        A = new int[N][N];
        food = new int[N][N];//양분
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
                food[i][j] = 5; //초기양분!
            }
        }

        // 나무 심은 위치
        for(int i = 0 ; i< M; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int age = Integer.parseInt(st.nextToken());
            trees.add(new Tree(r, c, age));
        }

        for(int i = 0 ; i < K; i++){
            spring();
            summer();
            autumn();
            winter();
        }
        System.out.println(trees.size());

    }
    static ArrayList<Tree> alive;
    static ArrayList<Tree> dead;
    
    static void spring(){
        alive = new ArrayList<>();
        dead = new ArrayList<>();
        Collections.sort(trees); // 어린나무..
    
        for(Tree t : trees){
            if (food[t.r][t.c] >= t.age){
                food[t.r][t.c] -= t.age;
                t.age++;
                alive.add(t);
            } else {
                dead.add(t);
            }
        }
    }

    static void summer(){
        for(Tree t : dead){
            food[t.r][t.c] += t.age/2;
        }

        trees = new ArrayList<>(alive);
    }

    static void autumn(){
        ArrayList<Tree> newTrees = new ArrayList<>();
        for (Tree t : trees) {
            if (t.age % 5 == 0) {
                for (int d = 0; d < 8; d++) {
                    int nr = t.r + dr[d];
                    int nc = t.c + dc[d];
                    if (nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
                    newTrees.add(new Tree(nr, nc, 1));
                }
            }
        }
        trees.addAll(0,newTrees);
    }

    static void winter() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                food[i][j] += A[i][j];
            }
        }
    }


}

