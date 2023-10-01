X, Y, W, H = map(int, input().split())

l = [X, Y, W-X, H-Y]
print(min(l))