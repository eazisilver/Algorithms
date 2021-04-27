'''
처음 풀었을 때 ---------------> 못 품 ...
아래의 코드는 교재 해설 보고 작성함.
'''
data = input()

count_0 = 0 # 전부 0으로 바꿀 때 ( 1 -> 0)
count_1 = 0 # 전부 1로 바꿀 때 ( 0 -> 1)

if data[0] == '1': 
  count_0 += 1 # 처음값이 1인데 0으로 바꿀 거니깐 처음값도 1로 바꿔야하기 때문
else : 
  count_1 += 1

for i in range(len(data)-1):
  if data[i] != data[i+1]:
    if data[i+1] == '1': # 1->0 으로 바꿔줘야 할 때
      count_0 += 1
    else:
      count_1 += 1

print(min(count_0, count_1))
