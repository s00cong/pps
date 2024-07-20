//알람 시계
#include <iostream>
using namespace std;

int main(){
    int H,M;
    cin >>H >>M;
    if(M<45){
        H--;
        M+=15;
    }
    else M-=45;
    if(H==-1) H=23;
    if(M==60){
        H++;
        M=0;
    }
    cout<<H<<" "<<M;
    return 0;
}