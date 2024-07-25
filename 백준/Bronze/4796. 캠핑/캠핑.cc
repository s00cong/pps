#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
    int L, P, V;
    vector<int> answer;
    int num = 0;
    while (1) {
        cin >> L >> P >> V;
        if (L * P * V == 0)break;
        int rest = (V % P > L) ? L : V % P; // 실수한 부분 ( ex : L=3, P=5,V=19)
        answer.push_back((V / P) * L + rest);
        num++;
    }

    for (int i = 0; i < num ; i++) {
        cout << "Case " << i + 1 << ": " << answer.at(i) << endl;

    }

    return 0;
}