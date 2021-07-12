#include <stdio.h>
#include <vector>

int main(){
    std::vector<long> numbers(1000001);
    for(int n=0; n<1000001; ++n){
        numbers[n] = 0;
    }
    numbers[1] = 1;
    numbers[2] = 2;
    numbers[3] = 4;
    for(int n=4; n<=1000000; ++n){
        numbers[n] += numbers[n-1]%1000000009;
        numbers[n] += numbers[n-2]%1000000009;
        numbers[n] += numbers[n-3]%1000000009;
    }
    int T;
    scanf("%d", &T);
    for(int t=0; t<T; ++t){
        int N;
        scanf("%d", &N);
        printf("%ld\n", numbers[N]%1000000009);
    }
    return 0;
}
