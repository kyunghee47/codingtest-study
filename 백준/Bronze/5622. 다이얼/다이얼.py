str = input()
sum = 0
for i in range(len(str)):
    if str[i] in ('A','B','C'):
        sum = sum + 3
    if str[i] in ('D','E','F'):
        sum = sum + 4 
    if str[i] in ('G','H','I'):
        sum = sum + 5
    if str[i] in ('J','K','L'):
        sum = sum + 6 
    if str[i] in ('M','N','O'):
        sum = sum + 7 
    if str[i] in ('P','Q','R','S'):
        sum = sum + 8
    if str[i] in ('T','U','V'):
        sum = sum + 9
    if str[i] in ('W','X','Y','Z'):
        sum = sum + 10
print(sum)
        