a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())
res = 1
for i in range(n0, 101):
    if a1*i+a0 > c*i:
        res=0
        break
print(res)