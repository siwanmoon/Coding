n=int(input())
num=list(map(int,input().split()))
t,p=map(int,input().split())

cnt=0

for i in num:
    cnt+=(i+t-1)//t
    
print(cnt)
print(n//p, n%p)