n = int(input())

for _ in range(n):
    if (x := len(input())) >= 6 and x <=9:
        print('yes')
    else:
        print('no')