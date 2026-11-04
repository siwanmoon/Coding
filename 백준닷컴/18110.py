import sys
input = sys.stdin.readline

n = int(input())
level = []

if n == 0:
    print(0)

else:
    for _ in range(n):
        level.append(int(input()))

    level.sort()
    cnt = int((n * 15 / 100) + 0.5)
    print(int((sum(level[cnt : len(level) - cnt]) / (len(level) - cnt * 2)) + 0.5))