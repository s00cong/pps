//잘라서 배열로 저장하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120913
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-잘라서-배열로-저장하기

#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_str, int n) {
    vector<string> answer;

    /*

    string str;
    int cnt = 0;
    for(auto s : my_str){
        
        str+=s;
        cnt++;  
        if(cnt==n){
            answer.push_back(str);
            str="";
            cnt=0;
        }
    }
    if(cnt>0)answer.push_back(str);

    */
    
    for(int i = 0; i<my_str.length(); i+=n){
        answer.push_back(my_str.substr(i,n));
    }
    return answer;
}

