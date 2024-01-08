#creating list and performing some methods 
# 1.insert()  2.remove() 3.append() 4.len() 5.pop() 6.clear()

#creation of list
li=[5,10,20,25,30,35,40]
print("The list is:",li)

#insertion of value into the list
print("original list:",li)
li.insert(6,50)
print("updated list:",li)

#Remove item from the list
print("original list:",li)
li.remove(35)
print("The updated list:",li)

#appending value to the list
print("Original list:",li)
li.append(57)
print("updated list:",li)

#finding the length 
print("original list:",li)
print("The length of the list is :",len(li))

#pop() operation without specifing index
print("original list:",li)
print("popped Element is:",li.pop())
print("list after pop",li)

#pop() operation by specifying index
print("popped element is :",li.pop(2))
print("The list after pop:",li)

#clear list
li.clear()
print("The list after clear",li)