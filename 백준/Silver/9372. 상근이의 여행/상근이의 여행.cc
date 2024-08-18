#include <iostream>
using namespace std;

int main(){

    int test, N, M;
    int a,b;
    cin >> test; 
    
    for(int i = 0; i<test; i++){
        cin >> N >> M;
        for(int j = 0; j<M; j++){
            cin >> a >> b;
        }
        cout << N-1 <<"\n";
    }
    return 0;
}