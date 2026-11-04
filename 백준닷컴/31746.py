n = int(input())
string = 'SciComLove'

n %= 2
print(string[::(-1)**n])