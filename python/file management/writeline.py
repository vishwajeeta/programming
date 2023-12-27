wr=open("omg.txt","w")
list1=["vishwa","indra","aman","ajay","sample","ajeet","sak"]
for line in list1:
    wr.writelines(line+"\n")
wr.close()