l = [[0 for col in range(100)] for row in range(100)]

n = int(input())

for _ in range(n):
    x, y = map(int, input().split())
    for row in range(x,x+10):
        for col in range(y,y+10):
            l[row][col] = 1

cnt = 0
for row in range(100):
    cnt += l[row].count(1)
print(cnt)