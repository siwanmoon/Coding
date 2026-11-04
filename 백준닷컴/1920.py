import sys
input = sys.stdin.readline

def search(l, h, k, num):
    mid = (l + h) // 2
    #print(l, h, mid, k) #debug
    
    if l > h:
        return 0
    
    if num[mid] == k:
        return 1
    elif num[mid] > k:
        return search(l, mid - 1, k, num)
    else:
        return search(mid + 1, h, k, num)

n = int(input())
num1 = list(map(int, input().split()))
num1.sort()
m = int(input())
num2 = list(map(int, input().split()))

for i in num2:
    print(search(0, n - 1, i, num1))