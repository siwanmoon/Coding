n = int(input())

for _ in range(n):
    sentence = list(map(str, input().split()))
    
    if sentence[0] == 'Simon' and sentence[1] == 'says':
        print("", *sentence[2:])