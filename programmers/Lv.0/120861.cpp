//캐릭터의 좌표
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120861
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-캐릭터의-좌표

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<string> keyinput, vector<int> board) {
    vector<int> answer;
    int height = board[1]/2;
    int weight = board[0]/2;
    int x=0;
    int y=0;
    for(auto str : keyinput){

        if(str=="up"&&y<height)y++;
        if(str=="down"&&y>(-1)*height)y--;
        if(str=="right"&& x<weight)x++;
        if(str=="left"&&x>(-1)*weight)x--;

    }
    answer.push_back(x);
    answer.push_back(y);

    
    return answer;
}