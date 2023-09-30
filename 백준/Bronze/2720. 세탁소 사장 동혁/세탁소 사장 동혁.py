T = int(input())

coin = [25, 10, 5, 1]

for _ in range(T):
    C = int(input())
    for i,x in enumerate(coin):
        print(C//x, end=' ')
        C -= (C//x)*x
    print()