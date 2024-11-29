n = int(input())

# n x n 행렬 입력 받기 (입력값은 사용하지 않음)
for i in range(n):
    a = list(map(int, input().split()))

# n x n 행렬 출력
for i in range(n):
    for j in range(n):
        print(i+1, end=' ')
    print()