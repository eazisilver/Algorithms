'''
처음 풀었을 때 ------------> 틀림
'''
## 풀이시간 10분

n = int(input())
data = list(map(int, input().split()))
data.sort(reverse =  True)
count = 0

index = 0
while index < n:
  if data[index] + index <= n:
    index += data[index]
    count += 1  
print(count)

'''
해설강의 보고 작성
'''
n = int(input())
data = list(map(int, input().split()))
data.sort()
count = 0
result = 0

for i in data:
  count += 1
  if count >=  i:
    result += 1
    count = 0
