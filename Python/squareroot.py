#  square root of prime number

num = int(input("Enter the number: "))
flag = True

if num > 1:
    for i in range(2, num):
        if num%i == 0:
            flag = False
            break

if flag is False:
    print("The number is not Prime")
else:
    sq = num ** 0.5
    print("Square root the prime number", num, " is ", round(sq, 2))
    
