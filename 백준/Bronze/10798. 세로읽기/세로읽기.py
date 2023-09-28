l = [input() for _ in range(5)]

for col in range(15):
    for row in range(5):
        if col < len(l[row]):
            print(l[row][col], end='')