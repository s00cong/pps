//외계어 사전
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120869
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-외계어-사전

#include <string>
#include <vector>
using namespace std;

int solution(vector<string> spell, vector<string> dic) {
    int answer = 0;
    vector<string> temp;
    for(int i = 0; i<spell.size(); i++){
        for(auto str : dic){
            if(str.find(spell[i])!=string::npos){
                temp.push_back(str);
            }
        }
        if(temp.size()==0)return 2;
        dic=temp;
        temp = {};
    }

    return 1;
}