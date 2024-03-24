//피자 나눠 먹기(2)
#include <string>
#include <vector>

using namespace std;

int GCD(int a, int b){
    if(a%b==0)return b;
    else return GCD(b,a%b);
}

int solution(int n) {
    //최대 공약수 찾기!
    //answer는 n/최대공약수
    int answer = 0;
    if(n>6)answer = n/GCD(6,n);
    else answer = n/GCD(n,6);
    return answer;
}