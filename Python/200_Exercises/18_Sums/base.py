a = int(input("Please enter a number: "))
Total = 0

for x in range(1, a):
    print(x, end="+")
    Total = Total + x
    
Total = Total + a
print(a)
print("The sum of values from 1 to " + str(a) + " is " + str(Total))

