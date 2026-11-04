n = int(input())
files = []
answer = ''

for _ in range(n):
    s = input()
    files.append(s)

string_len = len(files[0])

for i in range(string_len):
    s = files[0][i]    
    for j in range(1,n):
        if s != files[j][i]:
            answer = answer + '?'
            break
    if len(answer) == i:
        answer = answer + s

print(answer)