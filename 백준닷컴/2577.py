import math

a=int(input())
b=int(input())
c=int(input())

num=[0,0,0,0,0,0,0,0,0,0]

abc=a*b*c

for _ in range(int(math.log10(abc))+1):
    num[int(abc%10)]+=1
    abc/=10

for i in range(10):
    print(num[i])