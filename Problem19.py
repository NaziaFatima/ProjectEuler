import calendar

count= 0;
for y in range(1901,2001):
	for m in range(1,13):
		cal = calendar.monthcalendar(y,m)
		weekone = cal[0]
		if weekone[6]==1:
			#print " Year : " ,y ,"Month = " ,m
			count=count+1
print "Count = " ,count 