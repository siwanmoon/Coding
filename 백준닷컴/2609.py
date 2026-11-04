def gcd(x,y):
    while y>0:
        x,y=y,x%y
    return x

x,y=map(int,input().split())
print(gcd(x,y))
print(int((x*y/gcd(x,y))))