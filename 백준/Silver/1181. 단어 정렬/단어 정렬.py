N = int(input())
l = []
for _ in range(N):
    l.append(input())
l = list(set(l))
l.sort()
l.sort(key=len)

for i,x in enumerate(l):
    print(x)