#include <iostream>
#include <vector>
using namespace std;

int main(){

    int test_case;
    cin>>test_case;
    vector<int> T;
    int num;
    int answer=0;

    for(int i=0;i<test_case;i++){
        cin>>num;
        T.push_back(num);
    }
    for(int i=2;i<test_case-2;i++){
        for(int j=i-2;j<=i+2;j++){
            if(j==i)continue;
            else{
                
            }
        }
    }

    return 0;
}