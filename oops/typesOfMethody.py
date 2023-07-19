'''
1.instance methods
2.class methods
3.static methods

'''
class programming:
    program="python"
    def __init__(self):
        self.name="java"
        self.people="vishwa"
    
    def info(self,people):
        self.people
    #using class method
    @classmethod
    def details(cls,data):
        cls.program=data
        return cls.program
    @staticmethod
    def staticdata():
        print("buyy !!!")
        

language=programming()
print(language.program)
language.info("vishwa")
print(language.details("asvsi"))
language.staticdata()
print(language.program)
