cu, du = map(int, input().split())
cd, dd = map(int, input().split())
cp, dp = map(int, input().split())
h = int(input())
t = 0

while True:
    if t % cu == 0:
        h -= du
        
    if t % cd == 0:
        h -= dd
        
    if t % cp == 0:
        h -= dp
    
    if h <= 0:
        break
    
    t += 1

print(t)