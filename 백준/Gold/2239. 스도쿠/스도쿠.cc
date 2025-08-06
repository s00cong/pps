#include <iostream>
#include <algorithm>
using namespace std;

int map[10][10];

bool check(int x, int y) {
	//line
	for (int i = 0; i < 9; i++) {
		if (map[x][y] == map[x][i] && y!=i) return false;
		if (map[x][y] == map[i][y] && x != i) return false;
	}

	int bx = (x / 3) * 3;
	int by = (y / 3) * 3;

	for (int i = bx; i < bx + 3; i++) {
		for (int j = by; j < by + 3; j++) {
			if (map[x][y] == map[i][j] && (x != i && y != j)) {
				return false;
			}
		}
	}

	return true;
}

void solve(int x, int y) {
	if (x == 9) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cout << map[i][j];
			}
			cout << "\n";
		}
		
		exit(0);
	}
	if (y == 9) {
		solve(x + 1, 0);
		return;
	}

	if (map[x][y] == 0) {
		for (int i = 1; i <= 9; i++) {
			map[x][y] = i;
			if (check(x, y)) solve(x, y + 1);
		}
		map[x][y] = 0;
	}
	else
		solve(x, y + 1);
}


int main() {
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			scanf("%1d", &map[i][j]);
		}
	}
	
	solve(0, 0);

	return 0;

}
