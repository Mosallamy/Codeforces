import math
n, t, k, d = [int(i) for i in input().split()]
total  =  math.ceil(n/k * t)
time = ovenBuilt =  0
while(n > 0):
    time += 1
    if time % t == 0:
        n -= k
        if ovenBuilt:
            n -= k
    if not ovenBuilt and time == d:
        ovenBuilt = 1
print("YES", end="") if time < total else print("NO", end="")