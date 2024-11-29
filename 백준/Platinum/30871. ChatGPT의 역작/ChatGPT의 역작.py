import sys
input = lambda:sys.stdin.readline().strip()

H = 0x0123456789ABCDEF

def f(x, L, R, n):
    value = x
    for i in range(n):
        l, r = L[i], R[i]
        if l <= x <= r:
            value ^= (((x|l)+(x&r)*(l^r)) % (2**64))
    
    return value

def main():
    n = int(input())
    L = list(map(int, input().split()))
    R = list(map(int, input().split()))

    left, right = 0, 10**18

    while left <= right:
        mid = (left + right) // 2
        
        r1, r2 = f(mid, L, R, n), f(mid+1, L, R, n)

        if H <= r1: right = mid - 1
        elif r1 < H:
            if H <= r2: break
            else: left = mid + 1

    print([-1, mid][left <= right])

main()