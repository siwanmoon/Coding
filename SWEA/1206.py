T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    buildings = list(map(int, input().split()))
    answer = 0
    
    for i in range(len(buildings)):
        a = max(0, i - 2)
        b = min(len(buildings) - 1, i + 2)
        
        temp = max(buildings[a:i] + buildings[i + 1:b + 1])
        
        if buildings[i] > temp:
            answer += buildings[i] - temp
    
    print(f"#{test_case} {answer}")
