t = int(input())

for _ in range(t):
    word = input()
    player1 = ""
    player2 = ""
    
    if len(word) % 2 == 1:
        word += word
    
    for i in range(int(len(word) / 2)):
        player1 += word[i * 2]
        player2 += word[i * 2 + 1]
    
    print(player1)
    print(player2)