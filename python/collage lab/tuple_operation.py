# 3.create a tuple and perform the following methods
# a.Add items b.len() c.check for an item in tuple d.Access items

#creation of tuple
tup=("python","os","CN","English")
print(f"The tuple:{tup}")

#length of tuple
print(f"original tuple:{tup}")
print(f"Length of tuple:{len(tup)}")

#adding item to tuple
print(f"original tuple:{tup}")
New_tuple=tup+(5,6,7,8)
print(f"New tuple:{New_tuple}")

#checking for an item in tuple
print(f"original tuple:{tup}")

element='python'
result= element in tup
print(f"Does item is there in tuple or not: {result}")

element='computer organization'
result= element in tup
print(f"Does item is there in tuple or not: {result}")


#accessing an item from tuple
print(f"The element at index 2 is:{tup[2]}")
print(f"The element at index 0 is:{tup[0]}")
print(f"The element at index 3 is:{tup[3]}")