# Palindrome

string = input("Enter the String: ")
rev = ""

# print(string)
length = len(string)
for i in range(length-1, -1, -1):
	rev = rev + string[i]
	# print(string[i])

# print(rev)
if string == rev:
	print("String is Palindrome")
else:
	print("String is not a Palindrome")
