T = int(input())

for test_case in range(1, T + 1):
    n, m = map(int, input().split())
    scan = {'0001101' : 0, '0011001' : 1, '0010011' : 2, '0111101' : 3, '0100011' : 4,
            '0110001' : 5, '0101111' : 6, '0111011' : 7, '0110111' : 8, '0001011' : 9}
    
    for _ in range(n):
        temp = input()
        
        if '1' not in temp:
            continue
        
        max_index = max(i for i, x in enumerate(temp) if x == '1')
        code = temp

    if max_index < 55:
        answer = 0
    
    else:
        num = []
        
        for i in range(max_index - 55, max_index + 1, 7):
            num.append(scan[code[i:i + 7]])
        
        checksum = 0
        
        for i in range(8):
            if i % 2 == 0:
                checksum += num[i] * 3
                
            else:
                checksum += num[i]
                
        if checksum % 10 != 0:
            answer = 0
        
        else:
            answer = sum(num)

    print(f"#{test_case} {answer}")
