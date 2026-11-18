T = int(input())

def dfs(y, board):
    cnt = 0
    
    if y >= len(board):
        return 1
    
    for x in range(len(board)):
        if not board[y][x]:
            continue
        
        temp = list(map(list, board))
        
        for i in range(len(board)):
            if i != x:
                temp[y][i] = False
                
                if 0 <= x + y - i < len(board):
                    temp[x + y - i][i] = False
                
                if 0 <= y - x + i < len(board):
                    temp[y - x + i][i] = False
            
            if i != y:
                temp[i][x] = False
            
        cnt += dfs(y + 1, temp)
        
    return cnt

for test_case in range(1, T + 1):
    n = int(input())
    board = [[True] * n for _ in range(n)]
    
    print(f"#{test_case} {dfs(0, board)}")