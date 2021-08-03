arr = []

for i in range(0, 3):
	num = int(input("Enter the number: "))
	arr.append(num)

arr.sort()
# print(arr)
for i in range(0, 3):
	if i == 1:
		print(arr[1])
	else:
		continue
