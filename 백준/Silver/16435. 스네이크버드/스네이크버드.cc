#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int N,L;
    int h[1000];

    cin>>N>>L;
    for(int i=0;i<N;i++) cin>>h[i];
    sort(h, h + N);
    for(int i=0;i<N;i++){
        if(h[i]<=L)L++;
        else break;
    }
    cout<<L<<endl;
    return 0;
}