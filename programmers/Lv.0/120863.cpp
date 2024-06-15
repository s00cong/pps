//다항식 더하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-다항식-더하기

#include <string>
#include <vector>
#include <sstream>
#include <algorithm>
using namespace std;

string solution(string polynomial) {
    string answer = "";
    string temp = "";
    int x_cnt = 0;
    int n_cnt = 0;
    stringstream ss(polynomial);
    while(ss>>temp){
        if (temp=="+")continue;
        if(temp.find("x")!=string::npos){

            if(temp.size()>=2)x_cnt+=stoi(temp.substr(temp.begin(),temp.size()));
            else x_cnt++;
        }
        else n_cnt += stoi(temp);
    }
    if(x_cnt&&n_cnt){//x랑 자연수 둘 다 있을 때
        if (x_cnt==1) answer+="x";
        else answer+=to_string(x_cnt)+"x";
        answer+=" + ";
        answer+=to_string(n_cnt);
    }
    else{   //x랑 자연수 중 하나만 있을 때
        if(x_cnt==1)answer+="x";
        else if(x_cnt>1)answer+=to_string(x_cnt)+"x";
        if(n_cnt)answer+=to_string(n_cnt);
    }
    if(!x_cnt&&!n_cnt)answer="0";
    
    return answer;
}