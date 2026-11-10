import heapq

T = int(input())

for test_case in range(1, T + 1):
    v, e = map(int, input().split())
    graph = [[] for _ in range(v + 1)]
    visited = [False] * (v + 1)
    visited[0] = True
    visited[1] = True
    queue = []
    answer = 0
    
    for _ in range(e):
        a, b, c = map(int, input().split())
        graph[a].append((c, b))
        graph[b].append((c, a))
        
    for i in graph[1]:
        heapq.heappush(queue, i)
        
    while queue:
        temp = heapq.heappop(queue)
        
        if visited[temp[1]] == True:
            continue
        
        answer += temp[0]
        visited[temp[1]] = True
        
        for i in graph[temp[1]]:
            if visited[i[1]] == False:
                heapq.heappush(queue, i)
    
    print(f"#{test_case} {answer}")
