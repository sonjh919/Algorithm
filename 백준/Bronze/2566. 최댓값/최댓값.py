l = []
for _ in range(9):
    row = list(map(int, input().split()))
    l.append(row)

max = -1
max_row = -1
max_col = -1
for row in range(9):
    for col in range(9):
        if max <= l[row][col]:
            max = l[row][col]
            max_row = row
            max_col = col
print(max)
print(max_row+1, max_col+1, sep=' ')