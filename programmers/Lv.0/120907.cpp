//OX퀴즈
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-OX퀴즈

#include <string>
#include <vector>
#include <sstream>

using namespace std;

vector<string> solution(vector<string> quiz) {
    vector<string> answer;
    int plus = 0, minus = 0; int check = 0;
    int sub_answer = 0;
    string temp = "";
    for (auto str : quiz) {
        stringstream ss(str);
        
        while (ss >> temp) {
            
            if (check) {
                if (sub_answer == stoi(temp))answer.push_back("O");
                else answer.push_back("X");
                check = 0;
                sub_answer = 0;
            }
            
            if (plus) {
                sub_answer += stoi(temp);
                plus = 0;
                continue;
            }
            else if (minus) {
                sub_answer -= stoi(temp);
                minus = 0;
                continue;
            }
            else if (temp == "-")minus = 1;
            else if (temp == "+")plus = 1;

            if (temp == "=") {
                check = 1;
                continue;
            }

            else if (!plus && !minus) sub_answer = stoi(temp);//초기값 (num1)
        }
    }


    return answer;
}