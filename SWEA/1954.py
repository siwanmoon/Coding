T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    board = [[0] * n for _ in range(n)]
    x = 0
    y = 0
    dx = [1, 0 ,-1, 0]
    dy = [0, 1, 0, -1]
    d = 0
    
    for i in range(1, n * n + 1):
        board[y][x] = i
        
        if not 0 <= y + dy[d] < n or not 0 <= x + dx[d] < n or board[y + dy[d]][x + dx[d]] != 0:
            d += 1
            d %= 4
        
        y += dy[d]
        x += dx[d]
    
    print(f"#{test_case}")
    
    for b in board:
        print(*b)
