from sys import stdin
num = int(input())

for i in range(num):
    len,allowed = map(int, input().split())

    a = [int(x) for x in stdin.readline().rstrip().split()]
    p = [int(x) for x in stdin.readline().rstrip().split()]
    sorted = a.copy()
    sorted.sort()
    while(a != sorted):
        flag = False
        for j in range(allowed):
            if(a[p[j]-1] > a[p[j]]):
                flag = True
                temp = a[p[j]-1]
                a[p[j]-1] = a[p[j]]
                a[p[j]] = temp
        if(not flag):
            print('NO')
            break;
    if(a == sorted):
        print("YES")
