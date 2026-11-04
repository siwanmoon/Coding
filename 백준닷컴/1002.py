import sys
import math
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    
    l = math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
    
    if x1 == x2 and y1 == y2 and r1 == r2:
        print(-1)
        continue
        
    if l >= max(r1, r2):
        if l > (r1 + r2):
            print(0)
        elif l == (r1 + r2):
            print(1)
        else:
            print(2)
    else:
        if l + min(r1, r2) > max(r1, r2):
            print(2)
        elif l + min(r1, r2) == max(r1, r2):
            print(1)
        else:
            print(0)