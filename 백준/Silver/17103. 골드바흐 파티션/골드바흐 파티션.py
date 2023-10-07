import sys
input = sys.stdin.readline

prime = [False, False] + [True]*999999

for i in range(2,1000001):
    if prime[i]:
        for j in range(2*i, 1000001, i):
            prime[j] = False

N = int(input())
for _ in range(N):
    n = int(input())
    cnt = 0
    for i in range(2,int(n//2)+1):
        if prime[i] and prime[n-i]:
           cnt += 1
    print(cnt)