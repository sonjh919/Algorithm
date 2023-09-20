n = int(input())
score = list(map(int, input().split()))

m = max(score)
sum = 0
for i in range(n):
   sum += score[i]/m*100
print(sum/n)