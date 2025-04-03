def energy(E, A):
    A.sort(reverse=True)
    count = 0

    for energy_cost in A:
        if E <= 0:
            break
        E -= energy_cost
        count += 1
        if E > 0:
            E -= energy_cost
            count += 1

    return count if E <= 0 else -1

E = int(input())
N = int(input())
A = [int(input()) for _ in range(N)]

result = energy(E, A)
print(result)





'''def energy(n,li,count):

    if len(li) == 0:
        if n>0:
            return -1
        else:
            return count
    
    maximum = max(li)
    if maximum<=n:
        n= n-maximum
        count += 1

        if maximum<=n:
            n= n-maximum
            count += 1
    li.remove(maximum)
    return energy(n,li,count)

n = int(input())
s = int(input())
li = []
count = 0
for i in range(s):
    inp = int(input())
    li.append(inp)

e_count= energy(n,li,count)


print(e_count)
'''
