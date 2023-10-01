l = []
a,b,c = map(int, input().split())
l.append(a)
l.append(b)
l.append(c)
l.sort()

if l[0]+l[1]<=l[2]:
    l[2] = l[0]+l[1]-1

print(sum(l))