def RSP(a, b):
    match a:
        case "R":
            match b:
                case "R":
                    return "Draw"
                case "S":
                    return "Win"
                case "P":
                    return "Lose"
        case "S":
            match b:
                case "R":
                    return "Lose"
                case "S":
                    return "Draw"
                case "P":
                    return "Win"
        case "P":
            match b:
                case "R":
                    return "Win"
                case "S":
                    return "Lose"
                case "P":
                    return "Draw"
        

Ml, Mr, Tl, Tr = map(str, input().split())

if Ml == Mr and (RSP(Ml, Tl) == "Lose" or RSP(Ml, Tr) == "Lose"):
    print("TK")

elif Tl == Tr and (RSP(Tl, Ml) == "Lose" or RSP(Tl, Mr) == "Lose"):
    print("MS")
    
else:
    print("?")