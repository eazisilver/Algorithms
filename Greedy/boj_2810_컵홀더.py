'''
Bronze II
컵을 컵홀더에 놓을 수 있는 "최대 사람의 수" 출력

좌석 수보다 컵홀더 수가 더 많을 수도 있음!!
ex) 싱글좌석 1 인경우 컵홀더 2

커플좌석 LL 을 S로 치환해서 풀어보았다.
'''
n = int(input())
data = str(input()).replace('LL', 'S')
cup = len(data) + 1
print(cup if cup <= n else n)
