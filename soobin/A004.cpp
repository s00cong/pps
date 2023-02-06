#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;
    /*
    arr를 sorting하기
    반복문 돌려서 나누어 떨어지는거 answer에 넣기
        반복문은 벡터 사이즈만큼 돌리기
    그러고 반환하기
    */

/*
 다른 사람 코드 보고 느낀 점 및 배운 점 
 - 대부분 벡터에 값을 넣을 때 insert보단 push_back을 사용하는 것 같다.
 --> insert가 아예 안되네... 오류 떴어 push_back 사용하기!

 - return 부분을 짧게 짠 사람이 있었다.
 --> return answer.empty() ? vector<int>(1, -1) : answer;
    이런 방법이 있다는 걸 알게 되었다.

 */ 
   sort(arr.begin(),arr.end());
   for(int i = 0; i<arr.size();i++){
    if(arr[i]%divisor==0){
        answer.push_back(arr[i]);
    }
   }
   if(answer.size()==0) answer.push_back(-1);

    return answer;
}
