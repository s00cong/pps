#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n = 0, day = 1, answer = 0; // 묘목 구입날이 1일이므로
    cin >> n;
    vector<int> t;

    for (int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        t.push_back(temp);
    }
    sort(t.begin(), t.end(), greater<int>());   // 가장 오래 걸리는거부터 고려

    for (auto n : t) {
        if (answer < (day + n)) {
            answer = day + n;   // 시간이 지날수록 하루씩 더해줌
        }
        day++;
    }
    cout << answer + 1 << "\n"; // 이장님은 나무가 다 자란 다음날 초대

    return 0;
}