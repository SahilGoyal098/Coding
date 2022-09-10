# int(input())covert only integer in string into integer not float in integer
#int(76.7)=76 this will give int value 
a=float(input("enter your no."))
print(a)


#program to print the reverse no.
num=int(input("enter your no."))
while(num!=0):
    a=num%10
    print(a,end="")
    num=int(num/10)


for i in range(7,1,-1): #print()= prints new line
    print(i,end="\t")
    print()


# to calculate avg of first n natural
n=int(input("enter your no."))
sum=0
for i in range(1,n+1):
    sum=sum+i
avg=sum/n    
print("the sum of first n no. is:",sum)
print("the avg. of first n no. is:",avg)


# tto check wther year is leap or not
year=int(input("enter your year:"))
if(year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)):
    print(year,"is leap year")
else:
    print("not leap year")


#to sum the series
n=int(input("enter no. up to which u want to print series"))
sum=0    
for i in range(1,n+1):
    sum=sum+(1/i)
print("the sum of series is:",sum)    




#to sum the series
n=int(input("enter no. up to which u want to print series"))
sum=0    
for i in range(1,n+1):
    sum=sum+(1/i**2)
print("the sum of series is:",sum)        




    
#to sum the series
n=int(input("enter no. up to which u want to print series"))
sum=0    
for i in range(1,n+1):
    sum=sum+(i**i/i)
print("the sum of series is:",sum)      