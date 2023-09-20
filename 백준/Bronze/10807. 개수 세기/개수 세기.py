n = int(input())
l = list(map(int, input().split()))
v = int(input())
count = 0

for i in l:
  if i == v:
    count += 1
print(count)