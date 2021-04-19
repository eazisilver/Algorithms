'''
이동경로 8가지 확인하여 이동할 수 있는 경우의 수 찾기

dx, dy 리스트를 선언하여 이동할 방향을 기록한 것과 달리,
steps 변수가 dx, dy 변수의 기능 담고있다.

steps = [
  (dx1, dy1)
  (dx2, dy2)
  (dx3, dy3)
  ...      
]

'''

data = input()
row = int(data[1])
column = ord(data[0]) - int(ord('a')) + 1

steps = [
  (-2, 1),
  (-2, -1),
  (2, 1),
  (2, -1),
  (-1, 2),
  (1, 2),
  (-1, -2),
  (1, -2),
]

result = 0
for step in steps:
  dx = row + step[0]
  dy = column + step[1]
  if dx < 1 or dx > 8 or dy < 1 or dy > 8 :
    continue
  result += 1

print(result) 


'''
[Input data]
a1
[Output data]
2
'''
