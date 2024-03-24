#include <iostream>

using namespace std;

int main(void) {
    int n;
    cin >> n;
    for(int i=0;i < n; i++){
        for(int j = i; j>=0;j--){
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}