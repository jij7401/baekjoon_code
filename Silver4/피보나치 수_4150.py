def func(num):
    value=[1,1,1]
    if num==1:
        return value[1]
    elif num==2:
        return value[2]
    else:
        n=3
        while n<=num:
            value.append(value[n-1]+value[n-2])
            n+=1
        return value[num]
N=int(input())
print(func(N))