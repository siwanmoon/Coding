import sys
from collections import deque
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    queue = deque(map(int, input().split()))
    cnt = 0
    
    while queue:
        if max(queue) > queue[0]:
            queue.append(queue.popleft())
            m = m - 1
            if m < 0:
                m = m + len(queue)
    
        elif max(queue) == queue[0]:
            if m == 0:
                print(cnt + 1)
                break
            else:
                queue.popleft()
                cnt = cnt + 1
                m = m - 1
                if m < 0:
                    m = m + len(queue)