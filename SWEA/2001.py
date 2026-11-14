T = int(input())

for test_case in range(1, T + 1):
    n, m = map(int, input().split())
    board = []
    answer = 0
    
    for _ in range(n):
        temp = list(map(int, input().split()))
        board.append(temp)          
            
    for x in range(n - m + 1):       
        for y in range(n - m + 1):
            temp = 0
            
            for a in range(m):
                for b in range(m):
                    temp += board[y + b][x + a]
            
            if temp > answer:
                answer = temp            
    
    print(f"#{test_case} {answer}")
