N = int(input())

l = list(map(int, str(N)))
l.sort(reverse=True)

for i,x in enumerate(l):
    print(x, end='')