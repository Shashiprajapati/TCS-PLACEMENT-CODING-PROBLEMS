li = []
for i in range(0, 10):
    num = int(input("Enter number: "))
    li.append(num)
    
# sorts = sorted(li)
# print("The Greatest among above 10 numbers are : ",sorts[-1])

max = li[0]
for i in range(0, 10):
    if li[i] > max:
        max = li[i]
        
print("The greatest among above 10 numbers are: ", max)


