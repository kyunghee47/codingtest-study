str1, str2 =input().split()

str1 = int(str1[::-1])
str2 = int(str2[::-1])
print(max(str1,str2))