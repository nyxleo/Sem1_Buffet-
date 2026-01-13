import random

x = int(input("How many random numbers would you like? "))

numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]

thelist = []

for i in range(0, x):
    num = random.randrange(0, 10)
    thelist.append(numbers[num])

print("Your numbers are: ", end="")

for i in range(0, x):
    print(thelist[i], end="")
    if i != x - 1:
        print(", ", end="")
