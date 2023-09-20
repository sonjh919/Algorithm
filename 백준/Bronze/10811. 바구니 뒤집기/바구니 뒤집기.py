'''
1 2 3 4 5
2 1 3 4 5
2 1 4 3 5
3 4 1 2 5

'''

n, m = map(int, input().split())

l = [x for x in range(1, n+1)]

for x in range(m):
  i, j = map(int, input().split())
  tmp = l[i-1:j]
  tmp.reverse()
  for y in range(i-1,j):
      l[y] = tmp[y-i+1]

for x in range(n):
  print(l[x], end = ' ')
    

