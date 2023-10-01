while 1:
    l = []
    a,b,c = map(int, input().split())
    l.append(a)
    l.append(b)
    l.append(c)
    d = max(a,b,c)
    if a==0 and b==0 and c==0:
        break
    elif a+b+c-d <= d:
        print('Invalid')
    else:
        length = len(list(set(l)))
        if length==1:
            print('Equilateral')
        elif length==2:
            print('Isosceles')
        else:
            print('Scalene')