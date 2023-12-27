wr=open("writing1.txt","w")
wr.write("hello world!")
# we can't use read function if open type is w
# print(wr.read())

wr.close()