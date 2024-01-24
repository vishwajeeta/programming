fun=lambda x:x%2==0
li=[1,2,4,6,99,98,7,6]
result=filter(fun,li)
print(list(result))