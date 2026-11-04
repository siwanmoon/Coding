import sys

n, k = map(int, sys.stdin.readline().split())
circle = list(map(int, range(1, n + 1)))
josephus = []
cnt = 0

while len(circle) > 0:
    cnt = cnt + k - 1  
    if cnt >= len(circle):
        cnt = cnt % len(circle)
    
    josephus.append(circle.pop(cnt))

print('<' + ', '.join(map(str, josephus)) + '>')