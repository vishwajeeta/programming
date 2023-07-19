class People:
    def __init__(self):
        self.name="vishwa"
        self.age=20
    def compareage(self,other):
        if self.age==other.age:
            print("same age")
        else:
            print("different age")

    def comparename(self,other):
        if self.name== other.name:
            print("name are same")
        else:
            print("different name")

data=People()
data1=People()
print(data.name)
data1.age=21
data1.compareage(data)
data1.comparename(data)