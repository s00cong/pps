//로그인 성공?
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-로그인-성공
//map써서도 해보기
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> id_pw, vector<vector<string>> db) {

    for(auto user : db){
        if(user[0]==id_pw[0]){
            if(id_pw[1]==user[1]) return "login";
            else return "wrong pw";
        }
    }

    return "fail";
}