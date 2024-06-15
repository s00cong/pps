//문자열 계산하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120902
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-문자열-계산하기

#include <string>
#include <vector>
#include <sstream>
using namespace std;

int solution(string my_string) {
    int answer = 0;
    stringstream ss(my_string);
    string temp="";
    int plus = 0, minus = 0;
    while (ss >> temp) {
        if (minus) {    // "-" 다음 숫자 
            answer -= stoi(temp); 
            minus = 0;
        }
        else if (plus) {    // "+" 다음 숫자
            answer += stoi(temp);
            plus = 0;
        }
        else if (temp == "-") {
            minus = 1;
        }
        else if (temp == "+") {
            plus = 1;
        }
        else {
            answer += stoi(temp); // 처음 수 저장
        }
        
    }

    return answer;
}