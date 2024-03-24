// 주사위 개수
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> box, int n) {
    int answer = 1;
    for (auto &i : box)
        answer*=i/n;
    return answer;
}