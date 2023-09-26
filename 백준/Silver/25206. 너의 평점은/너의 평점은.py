gtos = {
    'A+': 4.5,
    'A0': 4.0,
    'B+': 3.5,
    'B0': 3.0,
    'C+': 2.5,
    'C0': 2.0,
    'D+': 1.5,
    'D0': 1.0,
    'F': 0.0
}

sum = 0
score_sum = 0
for _ in range(20):
  name, score, grade = input().split()
  if grade == 'P':
    continue
  else:
    sum += float(score) * gtos[grade]
    score_sum += float(score)

print(sum / score_sum)