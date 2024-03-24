#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/*
for문 돌리기
같은 숫자면 +count
다른 숫자를만나면?
    - 지금까지 센 count랑 최대값 저장해둔 max를 비교
        - max가 더 크면 그냥 넘어감
        - 
*/

int solution(vector<int> array) {
    sort(array.begin(),array.end());
    int max = 0;    //최대 높은 빈도 수
    int cnt = 1;    // 빈도 수
    int answer = 0; //답

    for(int i = 0; i<array.size();i++){
        if(i==0){
            max=1;
            answer = array[0];
        }
        else{
            if(array[i-1]==array[i])cnt++;
            else {// 다를 경우
                if(cnt>max){
                    max = cnt;
                    answer = array[i-1];
                }
                else if(cnt == max) answer = -1;

                cnt = 1;
            }
        }
    }


    return answer;
}