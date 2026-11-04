num=int(input())

for _ in range(num):
    cnt=0
    sum=0
    score=input()
    
    for i in score:
        if(i=="O"):
            cnt+=1
            sum+=cnt
            
        else:
            cnt=0
    print(sum)