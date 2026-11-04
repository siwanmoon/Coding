n=int(input())

sum=0
cnt=0
M=1234567891

for i in input():
    sum+=(ord(i)-96)*(31**cnt%M)
    cnt+=1
    sum%=M

print(int(sum%M))