#include <string>
#include <iostream>
using namespace std;
/*
문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12916
*/

bool solution(string s)
{
    /*
    배운 점 : tolower()함수를 써서 비교시키면 더 빨리 비교시킬 수 있다.
    */
    bool answer = true;
    int pcount = 0, ycount = 0;

    for(int i = 0 ; i<s.size();i++){
        if(s[i]=='p'||s[i]=='P'){
            pcount++;
        }
        else if(s[i]=='y'||s[i]=='Y'){
            ycount++;
        }
    }
    if(pcount==ycount) answer=true;
    else answer = false;

    return answer;
}