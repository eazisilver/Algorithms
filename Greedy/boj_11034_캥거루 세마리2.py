'''
Bronze III
except EORError => 입력이 끝났을 때 while문을 나올 수 있다.
'''

while True:
  try:
    a,b,c = map(int, input().split())
    print(max(c-b, b-a) -1)
  except EOFError:    # 입력이 끝났을 때 루프탈출
    break
