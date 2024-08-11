#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int sum = 0;
    cin >> n;
    int *v = new int[n];

    for(int i = 0 ; i < n ; i++){
        cin >> v[i];
        sum+=v[i];
    }
    sort(v,v+n);
    
    sum -= v[n-1];

    cout << sum;
    return 0;
}