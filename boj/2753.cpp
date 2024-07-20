#include <iostream>
using namespace std;
int main(){
    int year;
    cin>>year;
    int answer = 0;
    if(year%4==0){
        if(year%400==0)answer = 1;
        else if(year%100!=0)answer=1;
    }

    cout<<answer;
    return 0;
}