// Link : https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=CCPP&select-1=1&pageSize=10&pageIndex=1

#include <iostream>

using namespace std;

int main(){
    int T = 0;
    int avg = 0;
    int n;
    cin >> T;
    for(int i = 0; i<T; i++){
        for(int j = 0; j<10; j++){
            cin >>n;
            avg+=n;
        }
        avg = round(avg/10);
        cout << "#" <<i+1 << " " <<avg <<"\n";
    }

    return 0;
}