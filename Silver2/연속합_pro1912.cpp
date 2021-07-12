#include <iostream>
#include <algorithm>
using namespace std;

int a[100001];
int b[100001];
int main() {
	int n;
	cin >> n;
	for (int i = 1;i <= n;i++) {
		cin >> b[i];
	}
	int maxn = -1001;
	a[1] = b[1];
	for (int i = 2;i <= n;i++) {
		
		if (b[i] >= a[i-1] +b[i]) {
			a[i] = b[i];
		}
		else if (b[i] < a[i-1] + b[i]) {
			a[i] = a[i-1] + b[i];
		}
	}
	for (int i = 1;i <= n;i++) {
		if (maxn < a[i]) {
			maxn = a[i];
		}
	}
	cout << maxn << endl;
}