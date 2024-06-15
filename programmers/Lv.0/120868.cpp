//삼각형의 완성조건 (2)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120868
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-삼각형의-완성조건-(2)

    /*
    1. 두 수가 같을 경우
    2. 둘 중 긴 변이 있는 경우
        2-1. 긴 변 - 작은 변 보단 커야하고 긴 변 보단 작아야함.
    3. 두 개가 긴 변이 없는 경우 
        3-1. 두 수의 합보다는 작지만 둘 중 큰 수보단 커야함
        
    */

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    if(sides[0]==sides[1]) return sides[0];
    if(sides[0]+sides[1]==3) return 1;
    sort(sides.begin(),sides.end());
    for(int i = sides[1]-sides[0]; i<sides[1]; i++ ){
        answer++;
    }
    for(int i = sides[1]+sides[0]-1; i> sides[1]; i--){
        answer++;
    }


    return answer;
}
