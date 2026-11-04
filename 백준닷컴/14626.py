ISBN = input()

missing_index = ISBN.index('*')
sum = 0
a = 1

if missing_index % 2 == 1:
    a = 3

for i in range(13):
    if ISBN[i] == '*':
        continue
    elif i%2 == 0:
        sum = sum + int(ISBN[i])
    else:
        sum = sum + int(ISBN[i])*3

for i in range(10):
    if (sum + a * i) % 10 == 0:
        break
    
print(i)