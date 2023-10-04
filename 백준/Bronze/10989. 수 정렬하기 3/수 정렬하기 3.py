import sys
N = int(sys.stdin.readline())

# l = [0 for _ in range(10000)]
l = [0] * 10001

for _ in range(N):
    l[int(sys.stdin.readline())] += 1

for i,x in enumerate(l):
    while x>0:
        print(i)
        x -= 1