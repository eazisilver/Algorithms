'''
처음 풀었을 때 -------------> 정답!! 
if 조건만 늘여쓴 거 말고는 똑같음

풀이시간 9분
'''
str = input()
result = int(str[0])
for i in range(1, len(str)):
  if result * int(str[i]) == 0 or result * int(str[i]) == result :
    result += int(str[i])
  else:
    result *= int(str[i])
print(result)

'''
책 답안
'''
str = input()
result = int(str[0])
for i in range(1, len(str)):
  if result <= 1 or str[i] <= 1 : # 두 수 중에서 하나라도 0 혹은 1 인 경우, 곱하기보다는 더하기 수행
    result += int(str[i])
  else:
    result *= int(str[i])
print(result)
