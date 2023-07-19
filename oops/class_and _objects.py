class Computer:
    def phone(self):
        print("4gb","125 storage")
call=Computer()
#call the class first method is used less than second
call.phone()
Computer.phone(call)