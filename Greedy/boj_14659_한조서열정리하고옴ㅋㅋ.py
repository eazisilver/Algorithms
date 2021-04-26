'''

'''

import sys

n = int(input())
data = list(map(int, sys.stdin.readline().split()))
count = [0] * n
step_jump = 0
i = 0

while i < n:
  for j in range(i+1, n):
    step_jump = j
    if data[i] > data[j]:
      count[i] += 1
    else :  
      break
  i = step_jump
  if i == n-1 :  break
print(max(count))
