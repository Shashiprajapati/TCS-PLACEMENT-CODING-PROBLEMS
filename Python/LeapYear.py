# Leap Year

year = int(input("Enter the Year: "))

flag = False

if(year%4==0):
	if(year%100==0):
		if(year%400==0):
			flag=True
		else:
			flag = False
	else:
		flag = True
else:
	flag = False

if(flag is True):
	print("Entered year is a Leap Year")
else:
	print("Entered year is not a Leap Year")

