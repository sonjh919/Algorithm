X = int(input())

cnt = 1
level = 1
while X > cnt:
    level += 1
    cnt += level

if level % 2: # 홀수
    row = 1
    col = level
else: # 짝수
    row = level
    col = 1

while X<cnt:
    if level%2: # 홀
        row += 1
        col -= 1
    else: # 짝
        row -= 1
        col += 1
    cnt -= 1
print(row, '/', col, sep='')