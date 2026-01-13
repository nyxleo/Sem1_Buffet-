num1 = int(input("Please enter a number: "))
Oper = input("Please enter a operation: ")
num2 = int(input("Please enter another number: "))

if(Oper == "*" or Oper == "x"):
    print(str(num1) + " * " + str(num2) + " = " + str(num1 * num2))
elif(Oper == "+"):
    print(str(num1) + " + " + str(num2) + " = " + str(num1 + num2))
elif(Oper == "-"):
    print(str(num1) + " - " + str(num2) + " = " + str(num1 - num2))
elif(Oper == "/"):
    print(str(num1) + " * " + str(num2) + " = " + str(num1 / num2))
else:
    print("Invalid Input Try Again")
    