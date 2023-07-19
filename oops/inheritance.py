class A:
    def feature1(self):
        print("feature 1 is working")
    def feature2(self):
        print("feature 2 is working")
#B inherits A 'B is a child of A'
#single level inheritence
class B(A):
    def feature3(self):
        print("feature 3 is working")
    def feature4(self):
        print("feature 4 is working")
#multi level inheritence 
class C(B):
    def feature5(self):
        print("feature 5 is working")


b=B()
b.feature1()
b.feature2()
b.feature3()
b.feature4()
c=C()
c.feature5()

a=A()
a.feature1()
a.feature2()    

class X:
    def feature1(self):
        print("feature 1 is working")
    def feature2(self):
        print("feature 2 is working")
class Y:
    def feature3(self):
        print("feature 3 is working")
    def feature4(self):
        print("feature 4 is working")
#multiple level inheritence
class Z(X,Y):
    def feature5(self):
        print("feature 5 is working")

z=Z()
z.feature1()
z.feature2()
