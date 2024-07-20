#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main(){

    int a,b;
    string str_b;
    cin>>a>>b;
    str_b = to_string(b);
    str_b = reverse(str_b.begin(),str_b.end());
    for(auto num : str_b){
        cout<<a*(num-'0')<<endl;
    }
    cout<<a*b;

}