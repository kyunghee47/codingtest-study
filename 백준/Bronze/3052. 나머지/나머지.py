chkList = []

for _ in range(10):
    inputnum = int(input())
    num = inputnum % 42
    chkList.append(num)

setList = set(chkList)

print(len(setList))