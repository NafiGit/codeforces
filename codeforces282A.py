t = int(input())
x = 0
for i in range(t):
    operator = input()
    if (operator == "X--") or (operator == "--X"):
        x -=1
    elif (operator == "X++") or (operator == "++X"):
        x+=1
print(x)
