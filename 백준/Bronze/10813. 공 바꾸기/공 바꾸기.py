'''
1 2 3 4 5
2 1 3 4 5
2 1 4 3 5
3 1 4 2 5
3 1 4 5 5
'''

n, m = map(int, input().split())
l = [i+1 for i in range(n)]

for x in range(m):
  i, j = map(int, input().split())
  i -= 1
  j -= 1
  tmp = l[i]
  l[i] = l[j]
  l[j] = tmp

for x in range(n):
  print(l[x], end=' ')