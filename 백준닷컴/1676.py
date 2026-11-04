n = int(input())
cnt2 = 0
cnt5 = 0

for i in range(1, n+1):
    num = i
    while num % 2 == 0:
        num = num / 2
        cnt2 = cnt2 + 1
    while num % 5 == 0:
        num = num / 5
        cnt5 = cnt5 + 1

print(min(cnt2, cnt5))