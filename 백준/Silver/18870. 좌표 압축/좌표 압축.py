import sys

N = int(sys.stdin.readline())
l = (list(map(int, sys.stdin.readline().split())))
tmp = sorted(set(l))

dic = {tmp[i]:i for i in range(len(tmp))}
for i,x in enumerate(l):
    print(dic[x], end=' ')