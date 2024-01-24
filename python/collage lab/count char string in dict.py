str=input("Enter any string:")

dic={}

for i in str:
    dic[i]=str.count(i)
print(dic)