for _ in range(10):
    test_case = int(input())
    num = list(map(int, input().split()))
    cnt = ((min(num) - 1) // 15) * 15
    num = [x - cnt for x in num]
    i = 0
    
    while True:
        num[i % 8] -= i % 5 + 1
        
        if num[i % 8] <= 0:
            num[i % 8] = 0
            i += 1
            i %= 8
            break
        
        i += 1
        
    print(f"#{test_case}", *(num[i:] + num[:i]))
