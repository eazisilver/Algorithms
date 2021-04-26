'''
Bronze II
이중 for문으로 풀었을 때 시간초과
시간을 줄이는 방법은 현재 봉우리보다 낮은 봉우리는 건너뛰고 다음 봉우리를 체크
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
