total = int(input())
num = int(input())
data = []
sum = 0
for _ in range(num):
    price, cnt = map(int,input().split())
    product = price * cnt
    sum = sum + product 
if total == sum:
    print("Yes")
else:
    print("No")