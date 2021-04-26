'''
Bronze I

UPCPC, UCPCUCPC 등 UCPC가 순서대로 들어있으면 I love UCPC 출력
'''
input_data = input()
search = ['U', 'C', 'P', 'C']

# 소문자를 공백으로 치환
for i in range(len(input_data)):
  if input_data[i].islower() == True:
    input_data = input_data.replace(input_data[i], ' ')

# 공백을 empty로 치환
input_data = input_data.replace(' ','')

# U, C, P, C 가 순서대로 input_data에 있는지 확인
result = '' # U, C, P, C 를 순서대로 담을 변수
index = 0
for i in search:
  while index < len(input_data):
    if i == input_data[index] :
      result += i
      break
    index += 1
print('I love UCPC' if 'UCPC' in result else 'I hate UCPC')
