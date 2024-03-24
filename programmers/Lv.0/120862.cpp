//최댓값 만들기 (2)
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int size = numbers.size();
    sort(numbers.begin(),numbers.end());
    answer = max(numbers[0]*numbers[1],numbers[size-2]*numbers[size-1]);
    
    return answer;
}