num = int(input())
cities = [int(i) for i in input().split()]
print(f"{abs(cities[0] - cities[1])} {abs(cities[0] - cities[num-1])}")
for index, city in enumerate(cities):
    if index != (num - 1) and index != 0:
        minBetween = min(abs(city - cities[index - 1]), abs(city - cities[index + 1]))
        minEnd = max(abs(city - cities[0]), abs(city - cities[num - 1]))
        print(f"{min(minBetween, minEnd)} {max(minBetween, minEnd)}")
print(f"{abs(cities[num - 1] - cities[num - 2])} {abs(cities[num - 1] - cities[0])}", end="")