num = int(input())
cities = [int(i) for i in input().split()]

def length(x1,x2):
    return abs(x1 - x2)

for index, city in enumerate(cities):
    if index == 0:
        print(f"{length(city, cities[1])} {length(city, cities[num-1])}")
    elif index == num -1:
        print(f"{length(city, cities[index - 1])} {length(city, cities[0])}", end="")
    else:
        minBetween = min(length(city, cities[index - 1]), length(city, cities[index + 1]))
        minEnd = max(length(city, cities[0]), length(city, cities[num - 1]))
        print(f"{min(minBetween, minEnd)} {max(minBetween, minEnd)}")