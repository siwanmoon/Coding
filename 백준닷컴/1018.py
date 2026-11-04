x, y = map(int, input().split())

cnt1 = []
cnt2 = []
chessboard = []
cnt = 64

for i in range(x):
    chessboard.append(list(input()))
    
for i in range(x):
    cnt1.append([])
    for j in range(y):
        if (i + j) % 2 == 0:
            if chessboard[i][j] != 'B':
                cnt1[i].append(1)
            else:
                cnt1[i].append(0)
        else:
            if chessboard[i][j] != 'W':
                cnt1[i].append(1)
            else:
                cnt1[i].append(0)

for i in range(x):
    cnt2.append([])
    for j in range(y):
        if (i + j) % 2 == 0:
            if chessboard[i][j] != 'W':
                cnt2[i].append(1)
            else:
                cnt2[i].append(0)
        else:
            if chessboard[i][j] != 'B':
                cnt2[i].append(1)
            else:
                cnt2[i].append(0)

for i in range(x - 7):
    for j in range(y - 7):
        cnt = min(cnt, sum(cnt1[a][b] for a in range(i, i + 8) for b in range(j, j + 8)), sum(cnt2[a][b] for a in range(i, i+8) for b in range(j, j+8)))

print(cnt)