s = input()
sum = 0

for i in s:
    if i<'P':
        if ord(i)%3 == 0 or ord(i)%3 == 1:
            sum += ord(i)//3-19
        else:
            sum += ord(i)//3-18
    else:
        if i<='S':
            sum += 8
        elif i<='V':
            sum+=9
        else:
            sum+=10


print(sum)
