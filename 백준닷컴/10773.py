k = int(input())
stack = []

for _ in range(k):
    n = int(input())
    if n != 0:
        stack.append(n)
    elif len(stack) > 0:
        stack.pop()

print(sum(stack))