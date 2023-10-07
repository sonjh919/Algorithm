N, M = map(int, input().split())

S_N = []
S_M = []
for _ in range(N):
    S_N.append(input())

for _ in range(M):
    S_M.append(input())

cnt = 0

for i,x in enumerate(S_M):
    if x in S_N:
       cnt += 1

print(cnt)