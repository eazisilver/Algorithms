'''
Bronze III

coin type을 소수점단위로 계산하니깐 통과안됨.
계산할 때 float를 int로 변환해주니깐 안맞는 case가 있었던 것 같다.

c_types = [25, 10, 5, 1] 로 바꿔서 통과!
'''

c_types = [25, 10, 5, 1]

for c in range(int(input())):
  c = int(input())
  for coin in c_types:
    print(c // coin, end = " ")
    c %= coin
