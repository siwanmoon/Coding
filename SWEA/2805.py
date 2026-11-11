T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    answer = 0
    
    for i in range(n):
        temp = list(map(int, input()))
        answer += sum(temp[abs(n // 2 - i):n - abs(n // 2 - i)])
    
    print(f"#{test_case} {answer}")
