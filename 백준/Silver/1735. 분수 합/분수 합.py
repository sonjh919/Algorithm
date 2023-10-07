import sys
import math
input = sys.stdin.readline

A,B = map(int, input().split())
C,D = map(int, input().split())

E = A*D + C*B
F = B*D

L = math.lcm(E,F)
print(int(L/F), int(L/E))