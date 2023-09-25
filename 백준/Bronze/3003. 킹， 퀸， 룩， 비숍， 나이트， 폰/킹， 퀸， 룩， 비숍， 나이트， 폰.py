chess = [1, 1, 2, 2, 2, 8]
n = list(map(int, input().split()))

for i in range(6):
    chess[i] -= n[i]

for i in chess:
    print(i, end=' ')