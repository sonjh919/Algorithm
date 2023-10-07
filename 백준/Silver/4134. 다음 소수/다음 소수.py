import sys
import math
input = sys.stdin.readline

def isPrime(n):
    if n<=2:
        return 2
    c = 0
    while c == 0:
        c = 1
        for i in range(2,math.ceil(math.sqrt(n))+1):
            if n%i==0:
                n +=1
                c = 0
                break
    return n


T = int(input())
for _ in range(T):
    N = int(input())
    print(isPrime(N))
