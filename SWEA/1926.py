n = int(input())

for i in range(1, n + 1):
    cnt = sum(c in '369' for c in str(i))

    if cnt > 0:
        i = '-' * cnt
    
    print(i, end = ' ')