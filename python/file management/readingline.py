om=open("omg.txt","r")
i=0
while True:
    a=om.readline()
    print(a)
    i+=1
    if not a:
        print(f"Number of lines={i-1}")
        print(type(a))
        break

