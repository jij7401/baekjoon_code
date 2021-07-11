#include<stdio.h>

int main(void){
	int a[100000] = {}, n, k, i, j, max = -987654321, sum = 0;
	scanf("%d %d", &n, &k);
	for(i=0; i<n; i++){
		scanf("%d", &a[i]);
	}
	for(i=0; i<k; i++){
		sum += a[i];
	}
	for(i=0; i<=n - k; i++){
		if(sum > max){
			max = sum;
		}
		sum += a[i + k];
		sum -= a[i];
	}
	printf("%d", max);
	return 0;
}