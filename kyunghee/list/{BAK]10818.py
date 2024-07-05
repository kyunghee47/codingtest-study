import sys
n = int(input())
list =list(map(int, sys.stdin.readline().split()))

print('{0} {1}'.format(min(list),max(list)))