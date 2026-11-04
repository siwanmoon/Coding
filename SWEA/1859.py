#import sys
#sys.stdin = open("input.txt", "r")

import heapq

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    l = int(input())
    products = list(map(int, input().split()))
    answer = 0
    temp = []
    heapq.heapify(temp)
    
    for p in products:
        heapq.heappush(temp, p)
        
        while temp and temp[0] < p:
            print(temp[0], p)
            answer += p - temp[0]
            heapq.heappop(temp)
            heapq.heappush(p)
        
    print(f"#{test_case} {answer}")
