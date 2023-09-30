import math

A, B, V = map(int, input().split())
V -= A
print(math.ceil(V/(A-B))+1)