import sys

def binary_search(arr, start, target, end):
    while start<=end:
        mid = (start+end)//2
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            end = mid-1
        else:
            start = mid+1
    return None

N = int(sys.stdin.readline()) # 가지고 있는 숫자 카드 개수
l = list(map(int, sys.stdin.readline().split()))
M = int(input())
tmp = list(map(int, sys.stdin.readline().split()))

l.sort()
for i,x in enumerate(tmp):
    res = binary_search(l,0,x,len(l)-1)
    if res == None:
        print(0, end=' ')
    else:
        print(1, end=' ')