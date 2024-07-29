n, m = map(int, input().split())
lists = list(range(1,n+1)) 

for i in range(m):
    i, j = map(int, input().split())
    lists[i-1],lists[j-1] = lists[j-1],lists[i-1]

for i in lists:
    print(i, end=' ')
