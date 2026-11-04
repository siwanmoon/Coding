n=int(input())
print(int((n**2+n)/2))
print(int((n**2+n)**2/4))

cnt=0

for i in range(n+1):
    cnt+=i**3
    
print(cnt)

#숏코딩
#n=int(input())
#print(m:=n*-~n//2,m*m,m*m)