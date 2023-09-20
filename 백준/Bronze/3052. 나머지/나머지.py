l = []
for i in range(10):
  l.append(int(input())%42)

count = 0
for i in range(10):
  if l[i] not in l[0:i]:
    count +=1
print(count)