#include <iostream>
using namespace std;

int main(){
    int change;
    int answer = 0; 
    cin >> change;
    if(change==1||change==3){
        cout<<"-1\n";
        return 0;
    }
    answer += change/5;
    change %=5;
    if(change % 2 ==1) {
        answer--;
        change+=5;
    }
    answer += change/2;
    
    cout<<answer<<"\n";
    return 0;
}