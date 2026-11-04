import sys

num=int(input())
numbers=list(map(int,sys.stdin.readline().rstrip()))

sum=0

for i in range(num):
    sum+=numbers[i]
    
print(sum)


"""더 쉬운방식
input()
print(sum(map(int,input())))
"""