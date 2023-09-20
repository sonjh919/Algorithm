'''
1 30
2
'''

l = [0 for i in range(30)]

for i in range(28):
  n = int(input())
  l[n-1] = 1

for i in range(2):
  tmp = l.index(0)+1
  print(tmp, end=' ')
  l[tmp-1] = 1