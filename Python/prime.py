num = int(input("Enter the number: "))
flag =True

if num >1:
    for i in range(2, num):
        if num%i == 0:
            flag = False
            break;
        else:
            flag = True
        
if flag == True:
    print("The number is Prime number")
else:
    print("The number is not Prime number")