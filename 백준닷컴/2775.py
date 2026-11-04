t=int(input())

arr=[[0 for _ in range(15)] for _ in range(15)]

for x in range(15):
    arr[x][0]=x

for y in range(1,15):
    for x in range(1,15):
        sum=0
        for n in range(x+1):
            sum+=arr[n][y-1]
        arr[x][y]=sum
        
while t>0:
    k=int(input())
    n=int(input())
    print(arr[n][k])
    t-=1