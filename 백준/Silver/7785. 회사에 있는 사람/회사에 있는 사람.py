N = int(input())
d = {}

for _ in range(N):
    n, e = map(str, input().split())
    if n in d:
        del d[n]
    else:
        d[n]=e

l = list(d.keys())
l.sort(reverse=True)
for i,x in enumerate(l):
    print(x)