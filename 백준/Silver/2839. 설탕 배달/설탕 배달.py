n = int(input())

res = 0
while 1:
    if n % 5 == 0:
        res += n // 5
        break
    elif n % 3 == 0:
        res += n // 3
        res -= (n // 15) * 2
        break
    elif n == 1 or n == 2 or n == 4:
        res = -1
        break
    else:
        n -= 5
        res += 1
        continue

print(res)