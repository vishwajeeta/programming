class Computer:
    def __init__(self):#special method
        print("class of Computer! ")
    def phone(self):
        print("oppo","vivo","samsung")

androide=Computer()
androide.phone()

class Computer1:
    def __init__(self,phone1,phone2,phone3):

        self.phone1=phone1
        self.phone2=phone2
        self.phone3=phone3
        print(phone3,phone1,phone2)

    def phone(self):
        print(f"all the phone are listed are : {self.phone1},{self.phone2} and {self.phone3}")
phone=Computer1('oppo','vivo','samsung')
phone.phone()