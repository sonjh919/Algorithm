X, Y = [0,0,0], [0,0,0]
for i in range(3):
    X[i], Y[i] = map(int, input().split())

x = 0
y = 0
if X[0] == X[1]:
    x = X[2]
elif X[0] == X[2]:
    x = X[1]
else:
    x = X[0]

if Y[0] == Y[1]:
    y = Y[2]
elif Y[0] == Y[2]:
    y = Y[1]
else:
    y = Y[0]
print(x,y)