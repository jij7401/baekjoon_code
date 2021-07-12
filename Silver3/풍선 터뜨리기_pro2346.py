n = int(input())
temp=list(map(int,input().split()))
balloon=[]
ans=[]

for i in range(len(temp)):
    balloon.append([i+1,temp[i]])

idx = 0
while balloon:
    removeBalloon = balloon.pop(idx)
    ans.append(removeBalloon[0])

    if removeBalloon[1] > 0: removeBalloon[1] -= 1
    if balloon: idx = (idx + removeBalloon[1]) % len(balloon)

ans = list(map(str,ans))
print(' '.join(ans))
