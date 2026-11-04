total=int(input())
price=list(int(input()) for _ in range(9))
print(total-sum(price))