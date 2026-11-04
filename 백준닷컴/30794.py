lv, score = input().split()
lv = int(lv)

if score == "miss":
    print(0)
elif score == "bad":
    print(lv * 200)
elif score == "cool":
    print(lv * 400)
elif score == "great":
    print(lv * 600)
else:
    print(lv * 1000)