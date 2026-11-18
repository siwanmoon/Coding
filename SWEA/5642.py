T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    arr = list(map(int, input().split()))
    dp = []
    dp.append(arr[0])
    
    for i in range(1, n):
        dp.append(max(arr[i], dp[i - 1] + arr[i]))
        
    print(f"#{test_case} {max(dp)}")