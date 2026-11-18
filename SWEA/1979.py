T = int(input())

def add(cnt, n):
    if n in cnt:
        cnt[n] += 1
        
    else:
        cnt[n] = 1

for test_case in range(1, T + 1):
    n, k = map(int, input().split())
    cnt = {}
    
    board = [list(map(int, input().split())) for _ in range(n)]
    
    for y in range(n):
        temp = 0
        temp2 = 0
        
        for x in range(n):
            if board[y][x] == 0:
                if temp > 0:
                    add(cnt, temp)
                    temp = 0
                    
            else:
                temp += 1
            
            if board[x][y] == 0:
                if temp2 > 0:
                    add(cnt, temp2)
                    temp2 = 0
            
            else:
                temp2 += 1
        
        if temp > 0:
            add(cnt, temp)
        
        if temp2 > 0:
            add(cnt, temp2)
    
    if k not in cnt:
        cnt[k] = 0
            
    print(f"#{test_case} {cnt[k]}")
            