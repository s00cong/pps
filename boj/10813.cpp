#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int N,M;
    vector<int> a;
    cin>>N>>M;
    int i,j;
    for(int k = 1 ; k<=N; k++)
        a.push_back(k);

    while(M--){
        cin>>i>>j;
        swap(a[i-1],a[j-1]);
    }
    for(int k = 0 ; k<M-1; k++){
        cout<<a[k]<<" ";
    }
    cout<<a[M-1];
    return 0;
}