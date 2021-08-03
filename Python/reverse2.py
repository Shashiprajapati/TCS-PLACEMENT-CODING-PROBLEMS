num1 = int(input("Enter the number: "))
temp = num1
num2 = 0

while(num1 !=0):
    remainder = num1%10
    num2 = num2*10+remainder
    num1 = num1//10
    
print(num2)
if temp == num2:
    print("The number is Palindrome.")
else:
    print("The number is not Palindrome.")    
# print(num2)
