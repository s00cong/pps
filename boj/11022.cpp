#include <iostream>

using namespace std;

int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    int T = 0;
    int A,B;
    cin >> T;
    int k = 1;
    while(T--){
        cin >>A>>B;
        cout<<"Case #"<<k++
        <<": "<<A<<" + "<<B<<" = "
        <<A+B;
    }


    return 0;
}