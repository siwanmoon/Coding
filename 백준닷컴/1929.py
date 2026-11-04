import sys

def prime(a):
    if a == 1:
        return False
    else:
        for i in range(2,int(a ** 0.5) + 1):
            if a % i == 0:
                return False
        return True

m, n = map(int, sys.stdin.readline().split())

for i in range(m, n + 1):
    if prime(i):
        print(i)