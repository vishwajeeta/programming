#if no mode is passed as parameter default will be "r"
rd=open("writing1.txt","r")
print(rd.read())
rd.close()