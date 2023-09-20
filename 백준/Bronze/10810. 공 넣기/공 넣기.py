'''
0 0 0 0 0
3 3
    4 4
1 1 1 1
  2

1 2 1 1 0
'''

n, m = map(int, input().split())
l = [0 for i in range(n)]

for x in range(m):
  i, j, k = map(int, input().split())
  for y in range(i-1,j):
    l[y] = k

for x in range(n):
  print(l[x], end=' ')