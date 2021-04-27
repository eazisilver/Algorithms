'''
처음 풀었을 때 --------------> 못 품
규칙이 있는데 찾기가 어렵다 ㅠㅠ

예시 01)
target | i
ㅡㅡㅡㅡㅡㅡㅡㅡ
  1    | 1
(1+1)  | 2
(2+2)  | 3
(4+3)  | 8
target < i 인 경우 target 출력 => 7

예시 02)
target | i
ㅡㅡㅡㅡㅡㅡㅡㅡ
  1    | 1
(1+1)  | 2
(2+2)  | 3
(4+3)

target < i 없이 화폐단위를 모두 탐색하면 
현재 target 값이 출력 => 7
'''

n = int(input())
data = list(map(int, input().split()))
data.sort()

target = 1

for i in data:
  if target < i:
    break
  target += i

print(target)


