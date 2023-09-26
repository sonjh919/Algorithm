n = int(input())
cnt = 0

for i in range(n):
  s = list(input())
  j=0
  while j<len(s)-1:
    if s[j] == s[j+1]:
      del s[j+1]
      continue
    j += 1

  s_set = list(set(s))

  if len(s) == len(s_set):
    cnt +=1
print(cnt)