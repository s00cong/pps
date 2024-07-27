#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    int time[] = {300,60,10};
    cin>>T;
    vector<int> answer;
    if(T%10!=0){
        cout<<"-1"<<endl;
        return 0;
    }
    for(int i = 0 ; i<3; i++){
        
        answer.push_back(T/time[i]);
        T %=  time[i];
    }
    
    for(int i : answer){
        cout<< i <<" ";
    }

    return 0;
}