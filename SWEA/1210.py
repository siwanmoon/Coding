for _ in range(10):
    test_case = int(input())
    ladder = []
    answer = -1
    
    for _ in range(100):
        ladder.append(list(map(int, input().split())))
    
    start = [x for x in range(100) if ladder[0][x] == 1]
    
    for s in start:
        x = s
        y = 0
        
        while y < 100:
            if ladder [y][x] == 2:
                answer = s
                break
            
            if x > 0 and ladder[y][x - 1] == 1:
                while x > 0 and ladder[y][x - 1] == 1:
                    x -= 1
                
            elif x < 99 and ladder[y][x + 1] == 1:
                while x < 99 and ladder[y][x + 1] == 1:
                    x += 1

            y += 1            
    
    print(f"#{test_case} {answer}")
