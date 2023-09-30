N = int(input())
L = list(map(int, input().split()))

cnt = N
for n in L:
    if n==1:
        cnt -=1
        continue
    for i in range(2, n):
        if n%i==0:
            cnt -= 1
            break
print(cnt)