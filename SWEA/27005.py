T = int(input())
dp = []
dp.append(1)
dp.append(1)
k = []

for test_case in range(T):
    n = int(input())
    
    if n < len(dp):
        print(dp[n])
        continue
    
    for i in range(len(dp), n + 1):
        temp = 1
        s = set()
        
        if i % 2 == 0:
            k.append(i // 2)
            
        for a in k:
            b = dp[i - a] * 2 - dp[i - 2 * a]
            s.add(b)
            
            if temp == b:
                while temp in s:
                    temp += 1
            
        dp.append(temp)
    
    print(dp[n])
