from collections import Counter

n = int(input())
card = list(map(int, input().split()))
m = int(input())
num = list(map(int, input().split()))

card_counter = Counter(card)

for i in num:
    print(card_counter[i], end = ' ')