s = input()
l = [-1 for i in range(26)]
for i in s:
  if ord(i) >= 97 and ord(i) <= 122 and l[ord(i)-97] == -1:
    l[ord(i) - 97] = s.index(i)
  

for i in l:
  print(i, end=' ')