import math

n=int(input())
answer=0

for i in range(1,n+1):
    num=i
    k=int(math.log10(n)+1)
    
    for j in range(k):
        num+=i//(10**j)%10

    if(num==n):
        answer=i
        break

print(answer)