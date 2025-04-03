inp = "tars rats arts star"
#inp = "ovm omv"
l = inp.split()
count = 0
grp1= []
grp2 = []
k=0

if len(l[0]) < 3:
     t= 1
else:
    t = len(l[0])-2

for i in range(len(l)):
    if (count<=t):
        for j in range(len(l[0])):
                for k in range(len(l)):
                    if k!=i:
                        if l[i][j]==l[k][j]:
                            count+=1

    if count>=t:
        grp1.append(l[i])
    else:
        grp2.append(l[i])
    count=0

print(grp1,"\n",grp2)

res = []
res.append(grp1)
res.append(grp2)

print(res)
print(len(res))