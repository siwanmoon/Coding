import math

n=int(input())
numbers=list(map(int,input().split()))
cnt=0

for i in numbers:
    if(i==2 or i==3):
        cnt+=1
        continue
    
    for j in range(2,int(math.sqrt(i))+1):
        if(i%j==0):
            break
        
        if(j==int(math.sqrt(i))):
            cnt+=1

print(cnt)