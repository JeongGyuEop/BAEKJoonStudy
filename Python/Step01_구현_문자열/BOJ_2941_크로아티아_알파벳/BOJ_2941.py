s = input()

croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in croatia :
    s = s.replace(i, "!")

print(len(s))