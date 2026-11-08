T = int(input())

for test_case in range(1, T + 1):
    answer = 0
    dump_number = int(input())
    box = list(map(int, input().split()))
    
    for _ in range(dump_number):
        box[box.index(max(box))] -= 1
        box[box.index(min(box))] += 1
    
    print(f"#{test_case} {max(box) - min(box)}")