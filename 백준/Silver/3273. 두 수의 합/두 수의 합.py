n = int(input())
data = list(map(int,input().split()))
find = int(input())

cnt = 0
start, end = 0,n-1

data.sort()

while start < end:
    temp = data[start] + data[end]
    if temp == find:
        cnt += 1
        start += 1
        end -= 1  
    elif temp < find:
        start += 1
    else:
        end -= 1

print(cnt)