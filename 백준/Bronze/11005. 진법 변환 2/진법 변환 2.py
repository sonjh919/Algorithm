n, b = map(int, input().split())

l = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
num = []
while n>=b:
    num.append(int(n%b))
    n /= b
num.append(int(n%b))

for i,x in enumerate(num):
    num[i] = l[x]

print(''.join(num[::-1]))