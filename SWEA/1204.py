T = int(input())

for test_case in range(1, T + 1):
    answer = dict()
    test_case = int(input())
    score = list(map(int, input().split()))
    
    for s in score:
        if s in answer:
            answer[s] += 1
        
        else:
            answer[s] = 1
            
    target = max(answer.values())
    keys = [k for k, v in answer.items() if v == target]
    
    print(f"#{test_case} {max(keys)}")