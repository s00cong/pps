#include <iostream>
using namespace std;

int main(){

    int a;
    cin>>a;
    int temp = 0;
    if(a%4!=0)a+=4;
    temp = a/4;
    while(temp--){
        cout<<"long ";
    }
    cout<<"int";
}