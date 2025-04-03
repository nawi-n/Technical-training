s = int(input())
li = []
for i in range(s):
    li.append(int(input()))

n = int(input())

t = int(input())

sorted(li)

def find_k_nearest(arr, target, k):
    arr.sort()
    nearest = sorted(arr, key=lambda x: abs(x - target))[:k]
    return nearest

# Example usage:
arr = [4, 1, 7, 3, 10, 8]
target = 5
k = 3

result = find_k_nearest(arr, target, k)
print("K nearest elements:", result)


