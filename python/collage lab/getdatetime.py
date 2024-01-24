import datetime

today=datetime.datetime.today()
print("Today date and time is:",today)

now=datetime.datetime.now()
print("now date and time is:",now)

ctime=datetime.datetime.ctime(now)
print("current time",ctime)

cdate=datetime.datetime.date(now)
print("current date:",cdate)