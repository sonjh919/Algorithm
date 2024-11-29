N = int(input())
min_y = float('inf')
min_x = 0

for _ in range(N):
    x, y = map(int, input().split())
    if y < min_y:
        min_y = y
        min_x = x

print(min_x, min_y)