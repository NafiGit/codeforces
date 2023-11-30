t = int(input())

for testcase in range(t):

    inp = input().split()

    elements, k = int(inp[0]), int(inp[1])

    a = input().split()
    a = [int(num) for num in a]

    while(True):
        if(len(a)<=k):
            print("yes")
            break
        else:
            if(((a.index(min(a))+1)<=k) and ((len(a)-1-(len(a)-1-a[::-1].index(max(a))))<k)):
                a.remove(min(a))
                a.remove(max(a))
            else:
                print("no")
                break
