import sys
from collections import deque

n = int(sys.stdin.readline())
stack = deque()

for _ in range(n):
    command = sys.stdin.readline().strip()
    
    if command.startswith('push'):
        stack.append(command.split()[1])
        
    elif command == 'pop':
        if len(stack) > 0:
            print(stack.popleft())
        else:
            print(-1)
    
    elif command == 'size':
        print(len(stack))
        
    elif command == 'empty':
        if len(stack) > 0:
            print(0)
        else:
            print(1)
            
    elif command == 'front':
        if len(stack) > 0:
            print(stack[0])
        else:
            print(-1)
            
    elif command == 'back':
        if len(stack) > 0:
            print(stack[-1])
        else:
            print(-1)