n, s = map(int, input().split())
data = list(map(int, input().split()))

start, end = 0, 0
current_sum = 0
min_length = float('inf')  

while end < n:
    current_sum += data[end]
    while current_sum >= s:
        min_length = min(min_length, end - start + 1)
        current_sum -= data[start]
        start += 1
    end += 1

if min_length == float('inf'):
    print(0)
else:
    print(min_length)
