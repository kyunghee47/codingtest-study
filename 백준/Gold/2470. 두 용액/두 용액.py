n = int(input())
data = list(map(int,input().split()))
start, end = 0, n - 1

data.sort()  

answer = (data[start], data[end]) 
min_diff = abs(data[start] + data[end])  

while start < end:
    temp_sum = data[start] + data[end]
    temp_diff = abs(temp_sum)

    if temp_diff < min_diff:
        min_diff = temp_diff
        answer = (data[start], data[end]) 

    if temp_sum < 0:
        start += 1  
    else:
        end -= 1 

print(answer[0], answer[1])