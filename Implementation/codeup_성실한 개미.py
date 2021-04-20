'''
나의 풀이
'''
array = [list(map(int, input().split())) for _ in range(10)]

x,y = 1,1
array[x][y] = 9

while True:
  if array[x][y+1] != 1:
    y += 1
  else:
    x += 1
  if x == 9: break
  if array[x][y] == 2:
    array[x][y] = 9
    break
  else:
    array[x][y] = 9
  if x == 9 and y == 9: break
  
for i in range(10):
  for j in range(10):
    print(array[i][j], end = " ")
  print()

  
  '''
  모범 답안
  '''
array = [list(map(int, input().split())) for _ in range(10)]

x,y = 1,1
while True:
  if array[x][y] == 0: # 길을 갈 수 있을 때
    array[x][y] = 9
  if array[x][y] == 2: # 먹이를 찾았을 때
    array[x][y] = 9
    break    
    
  if (x == 9 and y == 9) or (array[x][y+1] == 1 and array[x+1][y] == 1): # 맨 아래의 가장 오른쪽에 도착하거나 길이 가로막혔을 때
    break
    
  if array[x][y+1] != 1:  # 오른쪽으로 갈 수 있을 때
    y += 1
  elif array[x+1][y] != 1: # 아래쪽으로 갈 수 있을 때
    x += 1
  
# 출력
for i in range(10):
  for j in range(10):
    print(array[i][j], end = " ")
  print()
  
  
