n=int(input())
print(sum(l:=list(map(int,input().split())))*100/(max(l)*n))