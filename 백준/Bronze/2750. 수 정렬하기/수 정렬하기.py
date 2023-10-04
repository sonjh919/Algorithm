N = int(input())
l = []
for _ in range(N):
    l.append(int(input()))
l.sort()
for i,x in enumerate(l):
    print(x)