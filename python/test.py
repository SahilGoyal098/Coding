import re
x="my 2 favorite numbers are 19 and 42"
y=re.findall("[aeiou]+",x)
print(y)