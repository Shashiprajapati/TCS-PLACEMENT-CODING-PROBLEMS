num1 = int(input("Enter 1st number: "))
num2 = int(input("Enter 2nd number: "))


if num1 > num2:
    max = num1
else:
    max = num2
    
while(True):
    if(max%num1==0 and max%num2==0):
        lcm = max
        break
    max = max+1
    
print("LCM is : ", lcm)
