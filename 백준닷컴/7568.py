n = int(input())
size = []
rank = []

for _ in range(n):
    x, y = map(int, input().split())
    size.append((x, y))

for i in range(n):
    cnt = 1
    for j in range(n):
        if size[i][0] < size[j][0] and size[i][1] < size[j][1]:
            cnt = cnt + 1
    rank.append(cnt)

print(*rank)