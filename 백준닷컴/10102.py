v = int(input())
result = input()

a = 0
b = 0

for _ in range(v):
    if result[0] == "A":
        a = a + 1
    elif result[0] == "B":
        b = b + 1
    
    result = result[1:]
    
if a > b:
    print("A")
elif a == b:
    print("Tie")
else:
    print("B")