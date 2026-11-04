from collections import deque

n = int(input())
card = deque(list(range(1, n + 1)))
    
while(len(card) > 1):
    card.popleft()
    temp = card.popleft()
    card.append(temp)

print(card[0])