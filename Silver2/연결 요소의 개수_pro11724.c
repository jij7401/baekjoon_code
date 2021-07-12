#include <stdio.h>

#define MAX_SIZE 1001

int N, M;
int edge[MAX_SIZE][MAX_SIZE];
int visit[MAX_SIZE];

void DFS(int cur) {
	visit[cur] = 1;

	for (int i = 1; i <= N; ++i) {
		if (!visit[i] && edge[cur][i])
			DFS(i);
	}
}


int main(void) {
	int DFS_cnt = 0;

	scanf("%d %d", &N, &M);

	for (int i = 0; i < M; ++i) {
		int a, b;
		scanf("%d %d", &a, &b);
		edge[a][b] = 1;
        edge[b][a] = 1;
	}

	for (int i = 1; i <= N; ++i) {
		if (!visit[i]) {
			DFS(i);
			DFS_cnt++;
		}
	}

	printf("%d\n", DFS_cnt);

	return 0;
}