#include <string>
#include <vector>

using namespace std;

int GCD (int a, int b){
    if(a%b==0)return b;
    else return GCD(b,a%b);
}

int solution(int a, int b) {
    int answer = 0;
    int gcd = GCD(max(a,b),min(a,b));
    a /= gcd;
    b /= gcd;
    if(b == 1) return 1;
    while(b!=1){
        if(b%2==0)b/=2;
        else if(b%5==0)b/=5;
        else return 2;
    }


    

    return 1;
}