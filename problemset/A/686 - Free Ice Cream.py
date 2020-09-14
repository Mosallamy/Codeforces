people, packs = input().split()
people = int(people)
packs = int(packs)
distress = 0

for i in range(people):
    action, pack = input().split()
    if action == "+":
        packs += int(pack)
    elif action == "-" and packs >= int(pack):
        packs -= int(pack)
    elif action == "-" and packs < int(pack):
        distress += 1

print(f"{packs} {distress}", end="")