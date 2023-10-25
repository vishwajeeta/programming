import hashlib
data=hashlib.sha256(b"vishwajeet").hexdigest()
print(data)
a=input("Enter your name:")

#as python doesn't support f and b we use f"".encode('utf-8')
data=hashlib.sha256(f"{a}".encode('utf-8')).hexdigest()
print(data)
