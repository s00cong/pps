#include <iostream>
#include <vector>

using namespace std;

int cnt;
int visit[101];
vector<int> network[101];

void dfs(int n) {
    visit[n] = 1;
    for (int i = 1; i <= network[n].size(); i++) {
        int next = network[n].at(i-1);
        if (!visit[next]) {
            cnt++;
            dfs(next);
        }
    }
}

int main() {

    int computer;
    int edge;
    int fr, to;
    cin >> computer;
    cin >> edge;

    for (int i = 1; i <= edge; i++) {
        cin >> fr >> to;
        network[fr].push_back(to);
        network[to].push_back(fr);
    }
    dfs(1);
    cout << cnt;

    return 0;
}