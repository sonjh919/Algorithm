s = input()
n = len(s)
flag = 1

for i in range(n//2):
    if s[i] != s[n-i-1]:
        flag = 0
        break
print(flag)