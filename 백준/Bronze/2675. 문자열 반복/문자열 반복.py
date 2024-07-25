T = int(input())
for _ in range(T):
    N, S = map(str, input().split())
    N = int(N)
    S = list(S)
    for i in range(len(S)):
        print(S[i] * N, end='')
    print() 