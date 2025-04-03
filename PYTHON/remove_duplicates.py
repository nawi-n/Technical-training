n = int(input())
li = []
for i in range(n):
    li.append(int(input()))

s =set()

for i in range(n):
    s.add(li[i])

print(s)