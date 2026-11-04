import sys
input = sys.stdin.readline

n = int(input())
sequence = []
stack = []
answer = []

for _ in range(n):
    sequence.append(int(input()))

cnt = 0
    
for i in range(1, n + 1):
    stack.append(i)
    answer.append('+')
    
    while sequence[cnt] == stack[-1]:
        stack.pop()
        answer.append('-')
        cnt += 1
        if not stack:
            break

if stack:
    print('NO')
    
else:
    for i in range(len(answer)):
        print(answer[i])