N, M = map(int, input().split())

l = []
for row in range(N):
    l.append(list(map(str, input())))


m = []
for row in range(N-7):
    for col in range(M-7):
        cnt1 = 0
        cnt2 = 0
        cnt3 = 0
        for r,x in enumerate(l[row:row+8]):
            for c,y in enumerate(x[col:col+8]):
                if (r+c)%2==0:
                    if y == 'B':
                        cnt1 += 1
                    else:
                        cnt2 += 1
                else:
                    if y == 'B':
                        cnt2 += 1
                    else:
                        cnt1 += 1
        m.append(cnt1)
        m.append(cnt2)
print(min(m))