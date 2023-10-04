N = int(input())
num = 666
cnt = 0
while 1:
    n = list(map(str, str(num)))
    for i in range(len(n)-2):
        if ''.join(n[i:i+3]) == '666':
            cnt += 1
            break
    if cnt == N:
        print(num)
        break
    else:
        num += 1