# Armstrong number

nums = str(input("Enter the number: "))
num1 = [int(num) for num in nums]
length = len(num1)
# print(nums)
# print(length)
add = 0

for i in range(0, length):
	add = add + num1[i]**3


ints = int(nums)
print(add)
if ints!=add:
	print("Number is not Armstrong")
else:
	print("Number is Armstrong")



