'''
그리디 알고리즘
Bronze IV
'''
t = int(input())
btn = [300, 60, 10]

while t > 0:
  if t % 10 != 0: 
    print(-1)
    break
  
  for i in btn:
    print(t // i, end =' ')
    t %= i
