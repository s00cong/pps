//피자 나눠 먹기(2)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120815
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-피자-나눠-먹기(2)

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