from sys import stdin
 
num = int(input())
 
for i in range(num):
    length ,days = map(int, input().split())
    pile = [int(x) for x in stdin.readline().rstrip().split()]
 
    j = 1
    while(days > 0 and j < length):
        if(pile[j] != 0 and j < length and j<=days):
            pile[0] +=1
            pile[j] -= 1
            days -= j
        else:
            j+=1
 
    print(pile[0])
