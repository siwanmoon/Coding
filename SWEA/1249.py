import heapq

T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    m = [list(map(int, input())) for _ in range(n)]
    visited = [[False] * n for _ in range(n)]
    dp = [[0] * n for _ in range(n)]
    queue = [(0, (0, 0))]
    visited[0][0] = True
    dx = [1, -1, 0, 0]
    dy = [0, 0, -1, 1]
    x = 0
    y = 0
    
    while queue:
        temp = heapq.heappop(queue)
        x = temp[1][0]
        y = temp[1][1]
        
        if x == n - 1 and y == n - 1:
            print(f"#{test_case} {temp[0]}")
            break
        
        for a, b in zip(dx, dy):
            tx = x + a
            ty = y + b
            
            if 0 <= tx < n and 0 <= ty < n and not visited[ty][tx]:
                heapq.heappush(queue, (temp[0] + m[ty][tx], (tx, ty)))
                visited[ty][tx] = True
