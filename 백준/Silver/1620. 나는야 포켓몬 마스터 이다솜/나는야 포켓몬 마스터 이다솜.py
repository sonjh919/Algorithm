import sys
N, M = map(int, sys.stdin.readline().split())

l = []
for _ in range(N):
    l.append(sys.stdin.readline().strip())
for _ in range(M):
    tmp = sys.stdin.readline().strip()
    if tmp.isdecimal():
        print(l[int(tmp)-1])
    else:
        print(l.index(tmp)+1)