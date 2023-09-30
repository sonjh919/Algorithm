N = int(input())

num = 1
level = 1
while 1:
    if N <= num:
        break
    num += 6*level
    level += 1
print(level)