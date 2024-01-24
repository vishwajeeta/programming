# create a dictionary and apply the following methods
# 1.print the dictionary items 2.access item 
# 3.use get() 4 change values 5.use len()

#create dictionary
dict1={101:'Ajay',102:'Balu',103:'kerthi'}
print('The dictionary is :',dict)

#accessing dictionary items by using key value
print("The list element is:",dict[101])
print("The list element is:",dict[102])
print("The list element is:",dict[103])

#accessing the element as a list
print(dict1.items())

#accessing the dictionary by using for loop
print("The element are:")
for i in dict1:
    print(i,dict1[i])

#updating value
print("Original dictionary is:",dict1)
dict1.update({102:'hii',103:'Devananda'})
print("update dictionary is:",dict1)