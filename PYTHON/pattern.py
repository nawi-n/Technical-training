def even(i):
    for j in range(n):
        print(i, end=" ") 
    print()
    
def generate_pattern(n):
    for i in range(1,n+1):
        if i % 2 == 0:
            print(i + 1, end=" ")  
            even(i)
        else:
            for j in range(n):
                print(i, end=" ")
            print(i+1)
        print()
        
n = int(input("Enter a number: "))
generate_pattern(n)

'''
output :


Enter a number: 5
1 1 1 1 1 2

3 2 2 2 2 2 

3 3 3 3 3 4

5 4 4 4 4 4 

5 5 5 5 5 6

'''
