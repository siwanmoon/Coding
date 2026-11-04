n=int(input())

if(n==1):
    print(1)

else:
    cnt=1
    layer=1
    
    while(cnt<n):
        cnt+=layer*6
        layer+=1
    
    print(layer)