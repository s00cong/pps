#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cctype>
using namespace std;

int main(){
    int answer_x=0,answer_y=0;
    int N=0;
    int M=0;
    cin >> N >> M;
    int temp=0;
    char **castle = new char*[N];
    for(int i = 0; i < N; i++){
        castle[i] = new char[M];
    }
    for(int i=0;i<N;i++){
        for(int j = 0; j<M; j++){
            cin >> castle[i][j];
        }
        for(int j = 0; j<M; j++){
            if(castle[i][j]=='X') temp++;
        }
        if(temp==0)answer_x++;
        temp=0;
    }
    for(int i=0;i<M;i++){
        
        for(int j = 0; j<N; j++){
            if(castle[j][i]=='X') temp++;
        }
        if(temp==0)answer_y++;
        temp=0;
    }

    cout<<max(answer_x,answer_y);

    return 0;
}