import datetime
now= datetime.datetime.today()
print("today date=\t ",now)
after=now+datetime.timedelta(days=8)
print(f"date after 8 days={after}")

after=now-datetime.timedelta(days=8)
print(after)