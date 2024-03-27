//가까운 수
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120890
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-가까운-수

#include <string>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int solution(vector<int> array, int n) {
    int answer = 0;
    int idx = 0;
    array.push_back(n);
    sort(array.begin(), array.end());
    for(int i = 0; i<array.size(); i++){
        if(array[i] == n){
            idx = i;
            break;
        }
    }
    if(idx==0) answer = array[1];
    else if(idx == array.size() - 1) answer = array[idx-1];
    else {
        if( pow( array[idx-1] - n, 2) < pow( array[idx+1] - n,2))answer = array[idx-1];
        else if ( pow( array[idx-1] - n, 2) > pow( array[idx+1] - n,2)) answer = array[idx+1];
        else answer = array[idx-1];
    }

    return answer;
}