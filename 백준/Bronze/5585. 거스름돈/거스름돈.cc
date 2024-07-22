#include <iostream>
using namespace std;

int main(){
    int pay;
    int charge;
    int answer = 0; 
    cin >> pay;
    charge = 1000 - pay;
    int money[] = {500,100,50,10,5,1};
    for(int i = 0; i<sizeof(money)/sizeof(int); i++){
        answer += charge/money[i];
        charge %= money[i];
    }
    cout<<answer<<"\n";
    return 0;
}