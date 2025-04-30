import sys


for line in sys.stdin :
    lower, upper, digit, space = 0, 0, 0, 0

    for c in line:
        if c.islower():
            lower += 1
        elif c.isupper():
            upper += 1
        elif c.isdigit():
            digit += 1
        elif c == ' ':
            space += 1

    print(lower, upper, digit, space)
