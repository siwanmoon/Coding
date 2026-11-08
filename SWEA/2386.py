T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    answer = []
    board = []
    
    for _ in range(n):
        board.append(int(input()))
    
    board.sort()
    prev = -1
    
    for b in board:
        if prev == -1:
            prev = b

        elif prev == b:
            prev = -1
        
        else:
            answer.append(prev)
            prev = b
    
    if prev != -1:
        answer.append(prev)
    
    print(f"#{test_case} {len(answer)}")