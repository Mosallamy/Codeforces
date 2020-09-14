num = int(input())

for i in range(num):
    word = input()
    if len(word) > 10:
        print(f"{word[0]}{len(word[1:-1])}{word[-1]}", end="")
    else:
        print(word, end="")
    if i != num-1:
        print()
    # 3 mintutes in Python