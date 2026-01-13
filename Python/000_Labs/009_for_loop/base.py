
length = int(input("Please enter line length: "))
direction = input("Do you want a horizontal or vertical line? ")
if direction == "horizontal":
    for i in range(length):
        print("*", end="")  
elif direction == "vertical":
    for i in range(length):
        print("*")  
else:
    print("Invalid input. Please type horizontal or vertical.")
