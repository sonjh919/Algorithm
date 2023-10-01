l = []

for _ in range(3):
    l.append(int(input()))
length = len(list(set(l)))
if sum(l) == 180:
    if length==1:
        print('Equilateral')
    elif length==2:
        print('Isosceles')
    else:
        print('Scalene')
else:
    print('Error')