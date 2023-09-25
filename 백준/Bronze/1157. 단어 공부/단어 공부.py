s = input()
l = [0 for i in range(26)]

flag = True

for i in s:
    l[ord(i.upper())-65] += 1

max_index = l.index(max(l))
max_value = max(l)
for i in range(max_index+1, 26):
    if l[i] == max_value:
        flag = False

if flag:
    print(chr(max_index+65))
else:
    print('?')