y = int(input("Please enter a year you'd like to check! "))
if y % 4 == 0:
    if y % 100 == 0:
        if y % 400 == 0:
            print("The year " + str(y) + " is a a leap year!")
        else:
            print("The year " + str(y) + " is not a leap year!")
    else:   
        print("The year " + str(y) + " is a a leap year!")
else:
    print("The year " + str(y) + " is not a leap year!")