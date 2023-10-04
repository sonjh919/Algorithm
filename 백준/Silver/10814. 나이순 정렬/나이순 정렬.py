N = int(input())
l = []
for _ in range(N):
    a, b = map(str, input().split())
    l.append([int(a), b])

l.sort(key= lambda x:x[0])
for r,row in enumerate(l):
    print(row[0], row[1])