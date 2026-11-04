n,m=map(int,input().split())
max_sum=0

card=list(map(int,input().split()))

for a in range(n-2):
    for b in range(a+1,n-1):
        for c in range(b+1,n):
            total=card[a]+card[b]+card[c]
            if(total>max_sum and total<=m):
                max_sum=total

print(max_sum)