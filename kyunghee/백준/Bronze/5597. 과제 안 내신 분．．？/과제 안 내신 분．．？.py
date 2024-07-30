allNum = list(range(1, 31))
chkNum = [] 

for _ in range(28):
    num = int(input())
    chkNum.append(num)

for item in allNum:
    if item not in chkNum:
        print(item)