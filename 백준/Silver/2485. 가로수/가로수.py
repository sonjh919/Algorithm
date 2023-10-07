import sys
import math
input = sys.stdin.readline

N = int(input())
l  = []
interval = []
for _ in range(N):
    l.append(int(input()))
for i in range(N-1):
    interval.append(l[i+1]-l[i])

G = interval[0]
for i,x in enumerate(interval[1:]):
    G = math.gcd(G, x)

cnt = 0
res = int((l[-1]-l[0])//G+1)
print(res-len(l))