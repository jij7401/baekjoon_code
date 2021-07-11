import sys
 
N, M = map(int, sys.stdin.readline().strip().split())
lst = list(map(int, sys.stdin.readline().strip().split()))
 
 
# LST to SUM_LST
# LST :   1 2 3  4  5
# SUM : 0 1 3 6 10 15
sum_lst = [0]*(len(lst)+1)
for i in range(1, len(lst)+1):
    sum_lst[i] = sum_lst[i-1]+lst[i-1]
 
 
# SUM[b] - SUM[a-1]
for i in range(M):
    a, b = map(int, sys.stdin.readline().strip().split())
    print(sum_lst[b]- sum_lst[a-1])