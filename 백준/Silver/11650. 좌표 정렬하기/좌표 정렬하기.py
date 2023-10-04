N = int(input())

p = []
for _ in range(N):
    p.append(list(map(int, input().split())))
p.sort()
for r,row in enumerate(p):
    for c,x in enumerate(row):
        print(x, end=' ')
    print()