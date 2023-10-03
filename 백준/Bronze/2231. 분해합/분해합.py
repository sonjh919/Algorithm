N = int(input())

num = 0
for i in range(N):
    if i+sum(list(map(int, str(i))))==N:
        num = i
        break
print(num)