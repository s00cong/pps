#include <iostream> 
#include <string.h>
#include <vector>
#include <queue>

using namespace std;
int map[1001][1001];    //자동 0 초기화
int visited[1001];
int N, E, V;    //node, edge, vertex (시작 노드)
queue<int> q;

void dfs(int n){

    visited[n]=1;
    cout<<n<<" ";
    for(int i = 1; i <= N; i++){
        if(map[n][i]==1&&visited[i]==0){
            dfs(i);
        }
    }

}

void bfs(int n){
    q.push(n);
    visited[n] = 1;
    cout << n << " ";

    while(!q.empty()){
        int cur = q.front();
        q.pop();

        for(int i = 1; i <= N; i++){
            if(map[cur][i]==1 && visited[i]==0){
                q.push(i);
                visited[i]=1;
                cout << i << " ";
            }

        }
        

    }


}

int main(){
    cin >> N >> E >> V ;
    int fr=0,to=0;

    for(int i = 0; i<E; i++){
        cin >> fr >> to;
        map[fr][to]=map[to][fr]=1;
    }

    dfs(V);
    memset(visited,0,sizeof(visited));
    cout<<"\n";
    bfs(V);

    return 0;
}