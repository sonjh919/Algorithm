import math

N, K = map(int, input().split())
l = []
for i in range(1, int(math.sqrt(N))+1):
    if N%i==0:
        l.append(i)
        l.append(N//i)

l = list(set(l))
l.sort()

if len(l) < K:
    print(0)
else:
    print(l[K-1])