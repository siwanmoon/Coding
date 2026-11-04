a=list()

for _ in range(10):
    if(int(b:=int(input())%42) not in a):
        a.append(b)

print(len(a))