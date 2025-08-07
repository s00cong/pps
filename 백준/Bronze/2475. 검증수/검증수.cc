
#include <iostream>
using namespace std;
int main(){
    int result = 0;
    int num = 0;
    for(int i = 0;i<5;i++){
        cin>>num;
        num*=num;
        result+=num;
    }
    cout << result%10<<endl;
    return 0;
}