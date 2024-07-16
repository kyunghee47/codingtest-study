def solution(a, d, included):
    total = 0
    for i, include in enumerate(included):
        if include:
            total += a + i * d
    return total