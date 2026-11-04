n = int(input())
dot = []

for _ in range(n):
    x, y = map(int, input().split())
    dot.append((x,y))

dot.sort(key = lambda p: (p[1], p[0]))

for i in range(n):
    print(*dot[i])