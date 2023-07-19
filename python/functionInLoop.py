
def kannada():
   return "this is kannada"
def english():
    return "this is english"
def hindi():
    return "this is hindi"
def accountancy():
    return "this is accountancy"
def maths():
    return "this is maths"
def social():
    return "this is social"
def computer():
    return "this is computer"
def business():
    return "this is business"
a={
    "kannada":kannada(),
    "english":english(),
"hindi":hindi(),
"accountancy":accountancy(),
"maths":maths(),
"social":social(),
"computer":computer(),
"business":business()

}
print(a["english"])
data=input("Enter the subject:")
for i in a:
    omg =a[i] if i in data else " \r "
    print(omg)
    if i in data:    
        print(a[i])
        

    else:
        continue
    
