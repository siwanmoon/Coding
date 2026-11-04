import sys
from collections import Counter
input = sys.stdin.readline

n = int(input())
num = []

for _ in range(n):
    num.append(int(input()))

num.sort()
count = Counter(num)
temp = 0
for i in count:
    if count[i] == max(count.values()):
        mode = i
        if temp != 0:
            break
        temp = 1
if sum(num) >= 0:
    print(int(sum(num) / len(num) + 0.5))
else:
    print(int(sum(num) / len(num) - 0.5))
print(num[int(len(num) / 2)])
print(mode)
print(num[-1] - num[0])