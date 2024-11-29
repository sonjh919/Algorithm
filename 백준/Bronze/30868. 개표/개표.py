T = int(input())

for _ in range(T):
    n = int(input())
    result = "++++ " * (n // 5) + "|" * (n % 5)
    print(result)