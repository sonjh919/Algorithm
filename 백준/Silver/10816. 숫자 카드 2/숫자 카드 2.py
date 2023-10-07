import sys
input = sys.stdin.readline
N = int(input())
l = list((map(int, input().split())))

tmp = list(set(l))
d = {tmp[i]:0 for i in range(len(tmp))}

M = int(input())
lM = list(map(int, input().split()))

for i,x in enumerate(l):
    d[x] += 1

for i,x in enumerate(lM):
    if x in d:
        print(d[x], end=' ')
    else:
        print(0, end=' ')