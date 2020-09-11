from string import ascii_lowercase

n, k = map(int, input().split())

index = 0
for i in range(n):
    if index >= k:
        index = 0
    print(ascii_lowercase[index], end ="")
    index += 1