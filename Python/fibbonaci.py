num = int(input("Enter the number: "))
a = 1
b = 1

if num == 1:
    print("Fibbonaci series: 0")
elif num == 2:
    print("Fibbonaci series: 0", a)
else:
    print("Fibbonaci series: 0", a, b, end=" ")
    for i in range(num-3):
        total = a+b
        b = a
        a = total
        print(total, end = " ")
    print()
