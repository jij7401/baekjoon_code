#include <stdio.h>

int main(void)
{
    int n, l;
    scanf("%d%d", &n, &l);
    while (1) {
        if (l > 100 || n < l * (l - 1) / 2) {
            printf("-1");
            return 0;
        }
        if (l % 2) {
            if (n % l == 0) {
                int val = n / l - l / 2;
                for (int i = 0; i < l; i++) {
                    printf("%d", val++);
                    if (i < l - 1)
                        printf(" ");
                    else
                        return 0;
                }
            }
            l++;
        }
        else {
            if ((n - l / 2) % l == 0) {
                int val = (n - l / 2) / l - l / 2 + 1;
                for (int i = 0; i < l; i++) {
                    printf("%d", val++);
                    if (i < l - 1)
                        printf(" ");
                    else
                        return 0;
                }
            }
            l++;
        }
    }
}