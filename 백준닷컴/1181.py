def swap(a, b):
    return b, a

def wcmp(a, b):
    if(len(a) < len(b)):
        return 1
    elif(len(a) == len(b) and a < b):
        return 1
    else:
        return 0

def partition(A, p, r):
    x = A[r]
    i = p - 1
    for j in range(p, r):
        if wcmp(A[j] , x):
            i = i + 1
            A[i], A[j] = swap(A[i], A[j])            
    A[r], A[i + 1] = swap(A[r], A[i + 1])
    
    return i + 1

def qsort(A, p, r):
    if p < r:
        q = partition(A, p, r)  
        qsort(A, p, q - 1)
        qsort(A, q + 1, r)
    
    return A

n = int(input())
words = []

for _ in range(n):
    words.append(input())
    
words = list(set(words))    
qsort(words, 0, len(words)-1)

for word in words:
    print(word)