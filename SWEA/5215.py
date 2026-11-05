T = int(input())

for test_case in range(1, T + 1):
    n, l = map(int, input().split())
    m = []
    dp = [(0, 0)]
    
    for _ in range(n):
        m.append(list(map(int, input().split())))
        
    for t, k in m:
        temp = []
        
        for i in dp:
            if i[1] + k <= l:
                temp.append((i[0] + t, i[1] + k))

        dp += temp
    print(len(dp))
    dp.sort(reverse = True)
    
    print(f"#{test_case} {max(dp)[0]}")
