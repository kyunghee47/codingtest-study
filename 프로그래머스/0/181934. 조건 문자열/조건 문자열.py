def solution(ineq, eq, n, m):
    if eq == "=":
        if ineq == "<":
            return 1 if n <= m else 0
        elif ineq == ">":
            return 1 if n >= m else 0
    elif eq == "!":
        if ineq == "<":
            return 1 if n < m else 0
        elif ineq == ">":
            return 1 if n > m else 0