s = input()
k = ['dz=', 'c=', 'c-', 'd-', 'lj', 'nj', 's=', 'z=']

for i in k:
  if i in s:
    s = s.replace(i,'a')
print(len(s))