n = int(input())

num = n//3
teams = list()
skills = [int(i) for i in input().split()]
skillsShallow = skills
visited = list()

for i in range(num):
    teams.append({})
    skillsShallow = skills
    for index, j in enumerate(skills):
        if j not in teams[i] and len(teams[i]) != 3 and index not in visited:
            teams[i][j] = index
            visited.append(index)

if any([len(i) == 3 for i in teams]):
    print(len([1 for i in teams if len(i) == 3] ))
    for index, i in enumerate(teams):
        if len(i) == 3:
            if index != 0:
                print()
            for k in i.values():
                print(k+1, end=" ")
else:
    print(0)