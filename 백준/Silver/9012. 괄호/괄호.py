def is_vps(s):
    stack = []
    for char in s:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if stack:
                stack.pop()
            else:
                return "NO"
    
    if not stack:
        return "YES"
    else:
        return "NO"

n = int(input())
for _ in range(n):
    ps = input()
    print(is_vps(ps))
