num1 = int(input("Enter the number: "))
temp = num1
num2 = 0


while(num1 != 0):
    rem = num1%10
    num2 = num2 + rem**3
    num1 = num1//10
    
if temp == num2:
    print("The number is Armstrong number.")
else:
    print("The number is not Armstrong number.")