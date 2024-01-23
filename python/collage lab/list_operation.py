# 2.create a list and perform the following methods
# a.insert() b.remove() c.append() d.len() e.pop() f.clear()

# creation of list
li=[5,10,20,25,30,35,40]
print(f"The list is :{li}")

#insertion of value into the list
print(f"original list: {li}")
li.insert(6,50)
print(f"updated list: {li}")

#remove item from the list
print(f"original list:{li}")
li.remove(35)
print(f"The updated list:{li}")

#appending value to the list
print(f"original list:{li}")
li.append(57)
print(f"updated list: {li}")

#finding the length
print(f"original list:{li}")
print(f"The length of the list is:{len(li)}")

#pop() operation without specifing index
print(f"original list:{li}")
print(f"Popped Element is:{li.pop()}")
print(f"List after pop {li}")

#pop() operation by specifying index
print(f"popped element is{li.pop(2)}")
print(f"The list after pop:{li}")

#clear list
li.clear()
print(f"The list after clear:{li}")