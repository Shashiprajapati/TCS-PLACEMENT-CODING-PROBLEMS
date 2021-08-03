strs = input("Enter the String: ")
str2 = ""
for i in range(len(strs)-1, -1, -1):
    str2+=strs[i]

if strs == str2:
    print("String is Palindrome.")
else:
    print("String is not Palindrome.")
# print(str2)