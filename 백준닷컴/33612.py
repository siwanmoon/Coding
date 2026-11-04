y = 2024
m = 8

n = 7 * (int(input()) - 1)
y = y + (m + n - 1) // 12
m = (m + n - 1) % 12 + 1

print(y, m)