num=list(int(input()) for _ in range(5))
num.sort()
print(int(sum(num)/5))
print(num[2])