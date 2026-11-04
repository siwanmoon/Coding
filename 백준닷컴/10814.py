n = int(input())
member = []

for _ in range(n):
    member.append(tuple(input().split()))

member.sort(key = lambda x : int(x[0]))

for i in range(n):
    print(*member[i])