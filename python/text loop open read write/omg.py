a=open("hii.txt","w")
i=0
while (i<=10-1):

    i=i+1
    a.write(f"{i}.hii \n")
a.close()
a=open("hii.txt","r")
omg=a.read()
print(omg)