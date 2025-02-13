#include <string>
#include <vector>

using namespace std;

int solution(int a, int d, vector<bool> included) {
    int answer = 0;
    int n = included.size();
    
    
    for(int i = 0; i < n; i++)
        if(included[i]) answer += ( a + i*d );

    return answer;
}