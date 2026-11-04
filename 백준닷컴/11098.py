n = int(input())

for _ in range(n):
    max_price = 0
    player = ""
    p = int(input())
    for _ in range(p):
        a, b = input().split()
        a = int(a)
        if(a > max_price):
            max_price = a
            player = b
    print(player)