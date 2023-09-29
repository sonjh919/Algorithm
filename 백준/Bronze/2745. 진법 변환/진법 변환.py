n, b = input().split()
ary = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

sum = 0
n = n[::-1]
for i,x in enumerate(n):
    sum += int(b)**i*ary.index(x)

print(sum)