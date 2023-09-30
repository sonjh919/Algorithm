M = int(input())
N = int(input())

l = []
for i in range(M, N+1):
    flag = True
    if i == 1:
        flag = False
    for j in range(2, i):
        if i%j==0:
            flag = False
            break
    if flag:
        l.append(i)

if not l:
    print(-1)
else:
    print(sum(l))
    print(l[0])