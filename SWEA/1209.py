for _ in range(10):
    test_case = int(input())
    arr = []
    
    for _ in range(100):
        temp = list(map(int, input().split()))
        
        if len(arr) == 0:
            answer = sum(temp)
        
        answer = max(answer, sum(temp))
        arr.append(temp)
        
    for i in range(100):
        temp = 0
        
        for j in range(100):
            temp += arr[j][i]
        
        answer = max(answer, temp)
    
    temp1 = 0
    temp2 = 0
    
    for i in range(100):
        temp1 += arr[i][99 - i]
        temp2 += arr[i][i]
    
    answer = max(answer, temp1, temp2)
    
    print(f"#{test_case} {answer}")