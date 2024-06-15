//직사각형 넓이 구하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120860
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-직사각형-넓이-구하기

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    sort(dots.begin(),dots.end());
    int x = dots[1][1]-dots[0][1];
    int y = dots[2][0]-dots[0][0];
    answer = x*y;
    return answer;
}