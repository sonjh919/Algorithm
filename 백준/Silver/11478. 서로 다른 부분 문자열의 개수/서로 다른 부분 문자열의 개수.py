import sys
input = sys.stdin.readline
s = input().strip()

l = []
for i,x in enumerate(s):
    for j in range(i+1, len(s)+1):
        l.append(s[i:j])

print(len(set(l)))