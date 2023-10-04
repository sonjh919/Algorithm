N = int(input())

p = []
for _ in range(N):
    x, y = map(int, input().split())
    tmp = [y,x]
    p.append(tmp)
p.sort()
for r,row in enumerate(p):
    for c,x in reversed(list(enumerate(row))):
        print(x, end=' ')
    print()