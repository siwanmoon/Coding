def find(parent, x):
    if parent[x] == x:
        return x
    
    while parent[x] != x:
        x = parent[x]
    
    return x

T = int(input())

for test_case in range(1, T + 1):
    v, e = map(int, input().split())
    parent = [x for x in range(v + 1)]
    queue = []
    answer = 0
    
    for _ in range(e):
        a, b, c = map(int, input().split())
        queue.append((c, [a, b]))
    
    queue.sort()
        
    for q in queue:
        a = q[1][0]
        b = q[1][1]
        c = q[0]
        
        if a > b:
            a, b = b, a
        
        pa = find(parent, a)
        parent[a] = pa
        pb = find(parent, b)
        parent[b] = pb
        
        if pa == pb:
            continue
            
        answer += c
        parent[pb] = parent[pa]
    
    print(f"#{test_case} {answer}")