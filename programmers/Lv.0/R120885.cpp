//이진수 더하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120885
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-이진수-더하기

//bitset써서 해보기
//stoi 써서 해보기 
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int twoToten(string str){
    int result = 0;
    int temp = 1;
    for(auto bin : str){
        if(bin=="1")result+=temp;
        temp*=2;
    }
    return result;
}

string solution(string bin1, string bin2) {
    string answer = "";
    int decimalnum = 0;
    reverse(bin1.begin(),bin1.end());
    reverse(bin2.begin(),bin2.end());
    decimalnum = twoToten(bin1)+twoToten(bin2);
    if(decimalnum==0)return "0";
    while(decimalnum!=0){
        if(decimalnum%2==0)answer+=0;
        else answer+=1;
        decimalnum/=2;
    }
    reverse(answer.begin(),answer.end());
    return answer;
}