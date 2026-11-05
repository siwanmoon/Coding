def change(num, a, b):
    num = str(num)
    
    if a > b:
        a, b = b, a
    
    return int(num[:a] + num[b] + num[a + 1:b] + num[a] + num[b + 1:])

def dfs(num, sw, visited):
    global answer
    
    if (num, sw) in visited:
        return
    
    visited.add((num, sw))
    
    if sw == 0:
        if num > answer:
            answer = num
        
        return

    l = len(str(num))
            
    for a in range(l):
        for b in range(a + 1, l):
            temp = change(num, a, b)
            
            if (temp, sw - 1) not in visited:
                dfs(temp, sw - 1, visited)
    
    
    

T = int(input())

for test_case in range(1, T + 1):
    n, sw = map(int, input().split())
    answer = 0
    visited = set()
    dfs(n, sw, visited)
    
    print(f"#{test_case} {answer}")
