#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    string str;
    cin >> str;
    int zero = 0, one = 0;
    char prev = -1;

    for (auto ch : str) {
        if (prev != ch) {
            if (ch - '0'== 1 ) one++;
            else zero++;
            prev = ch;
        }
    }

    cout << min(one, zero);


    return 0;
}