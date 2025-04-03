a = int(input("enter num1:"))
b = int(input("enter num2:"))

sum=a+b
sub=a-b

if (sub<0):
    print(abs(sub))
    sub = sub*(-1)

print(f"sum:{sum} sub:{sub}")

