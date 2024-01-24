import datetime

today=datetime.datetime.today()
print("Today date and time is:",today)

after=today+datetime.timedelta(days=5)
print("after 5 days=",after)

before=today-datetime.timedelta(days=5)
print("before 5 days=",before)
