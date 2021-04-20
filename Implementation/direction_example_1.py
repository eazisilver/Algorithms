'''
상하좌우
2차원배열 내에서 입력받은 방향대로 이동
'''

n = int(input())
plans = input().split()
x, y = 1, 1

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
move_types = ['L', 'R', 'U', 'D']

for plan in plans:
  for i in len(move_types):
    if plan == move_types[i]:
      nx = x + dx[i]
      ny = y + dy[i]
  if nx < 1 or nx > n or ny < 1 or ny > n:
    continue
  x, y = nx, ny

print(x, y)

''' 
[Input data]  
5
R R R U D D
[Output data]
3 4
''' 
