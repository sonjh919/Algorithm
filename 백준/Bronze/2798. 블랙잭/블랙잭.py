import itertools as iter

N, M = map(int,input().split())
l = list(map(int, input().split()))

com = list(iter.combinations(l, 3))
s = 0
for x in com:
    tmp = sum(x)
    if s < tmp and tmp <=M:
        s = sum(x)
print(s)