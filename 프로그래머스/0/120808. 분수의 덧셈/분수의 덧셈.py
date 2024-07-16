import math
def solution(numer1, denom1, numer2, denom2):
    new_numer = numer1 * denom2 + numer2 * denom1
    new_denom = denom1 * denom2
    gcd = math.gcd(new_numer, new_denom)
    return [(numer1 * denom2 + numer2 * denom1) // gcd,(denom1*denom2) // gcd]