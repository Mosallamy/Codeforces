num = int(input())
for i in range(num):
    a, b = map(int, input().split())
    if((a-b) < 0 and (a-b) % 2 !=0):
        print(1)
    elif((a-b) < 0 and (a-b) % 2 ==0):
        print(2)
    elif((a-b) == 0):
        print(0)
    elif((a-b) > 0 and (a-b) % 2 !=0):
        print(2)
    elif((a-b) > 0 and (a-b) % 2 ==0):
        print(1)
