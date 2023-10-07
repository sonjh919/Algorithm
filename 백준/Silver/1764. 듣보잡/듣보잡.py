import sys
input = sys.stdin.readline

N, M = map(int, input().split())
l = []
ll = []
for _ in range(N):
    l.append(input().strip())
for _ in range(M):
    ll.append(input().strip())
res = list(set(l).intersection(set(ll)))
res.sort()

print(len(res))
for i,x in enumerate(res):
    print(x)