symbol = input("What symbol would you like to use? ")
width = int(input("What's the width of your box? "))
height = int(input("What's the height of your box? "))

for i in range(height):        
    for j in range(width):     
        print(symbol, end="")  
    print()                    