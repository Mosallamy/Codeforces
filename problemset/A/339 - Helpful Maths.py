string = str(input())

string = string.split("+")
string.sort()
for index, value in enumerate(string):

    if index != len(string)-1:
        print(value, end="+")
    else:
        print(value, end="")