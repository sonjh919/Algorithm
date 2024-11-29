import sys
input = sys.stdin.readline

N = int(input())
answer = []
for _ in range(N):
    S, T = map(str, input().split())
    for i, s in enumerate(S):
        if s == 'x' or s == 'X':
            answer.append(T[i].upper())
            break

print(''.join(answer))