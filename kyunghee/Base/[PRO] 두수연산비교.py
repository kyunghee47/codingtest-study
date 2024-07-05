def solution(a, b):
    num1 = str(a)+str(b)
    num2 = 2 * a * b 
    if int(num1) == num2:
        return int(num1)
    else:
        return max(int(num1),num2)