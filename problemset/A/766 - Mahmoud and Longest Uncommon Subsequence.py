string1 = input()
string2 = input()
if string1 == string2:
    print(-1)
else:
    print(max(len(string2),len(string1)))