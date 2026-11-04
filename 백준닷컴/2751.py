import sys
input = sys.stdin.readline

n = int(input())
num = list()

for _ in range(n):
    x = int(input())
    num.append(x)

num = list(set(num))
num.sort()

for i in num:
    print(i)