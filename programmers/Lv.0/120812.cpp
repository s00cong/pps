#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int cnt = 1;
    int max_cnt = -1;
    int max = 0;
    int prev = -1; // 이전 숫자
    sort(array.begin(), array.end());
    if (array.size() == 1) return array[0];

    else {
        for (auto num : array) {
            if (prev == num) {
                cnt++;
                if (max_cnt < cnt) {
                    max_cnt = cnt;
                    max = num;
                }
            }
            else {
                if (cnt == max_cnt && max != prev)max = -1;
                if (max_cnt == -1)max_cnt = cnt;
                cnt = 1;
            }

            prev = num;
        }
    }
    if (cnt == max_cnt && max != prev)max = -1;
    answer = max;

    return answer;
}
