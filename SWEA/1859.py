T = int(input())

for test_case in range(1, T + 1):
    l = int(input())
    products = list(map(int, input().split()))
    answer = 0
    max_price = 0
    
    for p in products[::-1]:
        if p < max_price:
            answer += max_price - p
        
        else:
            max_price = p

    print(f"#{test_case} {answer}")
