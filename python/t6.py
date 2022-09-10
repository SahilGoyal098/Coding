x1=int(input("enter x coordinate of first point :"))    # distance b/w two points
x2=int(input("enter x coordinate of second point :"))
y1=int(input("enter y coordinate of first point :"))
y2=int(input("enter y coordinate of second point :"))
distance=((x2-x1)**2 +(y2-y1)**2)**0.5
print(distance)
 

# area of circle 
r=float(input("enter the radius of circle")) 
area=3.14*r*r
print(area)

#to find ones place digit
num=input("enter your number :")
print(f"the digit at ones place is {num[-1]}")

# check  whether no. is even or odd
n=int(input("enter your number :"))
if(n%2==0):
    print("even")
else:
    print("odd")    

#to determine larger no.
num1=int(input("enter first number :"))
num2=int(input("enter second number :"))
num3=int(input("enter third number :"))
if (num1>num2 and num1>num3 ):
    print(num1,"is the largest")
elif(num2>num1 and num2>num3):
    print(num2,"is the largset")
else:
    print(num3," is the largest")        

# marks related program 
marks1=int(input("marks of math is"))
marks2=int(input("marks of science is"))
marks3=int(input("marks of social science is "))
marks4=int(input("marks of english is"))
total_marks=marks1+marks2+marks3+marks4
per=total_marks/4
print(per)
if(per>75):
    print("distinction")
elif(per>=60 and per<75):
    print("first divison")
elif(per>=50 and per<60):
    print('second division')
elif(per>=40 and per<50):
    print("third divison")
else:
    print("fail")               