                                               #functions
from queue import PriorityQueue


def sum(n1,n2):
    c=n1+n2
    return(c) 


def multiplication(a,b):
    return(a*b)


def divison(l,m):
    o=l/m
    return(o)

print(sum(4,7))
print(multiplication(8,9))
k=divison(9,3)
print(k)



def name(firstname,lastname="goyal"):
    return(firstname+lastname)
a=input("enter your first name\n")
b=input("enter your last name\n")
print(name(a))    



def cube(x):
    c=x**3
    return(f"cube of {x}is {c}")
d=cube(7)  
print(d)  


# to return the average of its arguments
def avg(n1,n2):
    c=(n1+n2)/2
    return("average of numbers is:",c)
print(avg(7,9852))    


# to convert time into minutes
def minutes(hrs,min):
    b=hrs*60+min
    return(f"{hrs} hrs {min}min ={b}minutes")

print(minutes(2,78))



# to print series
def fact(n):
    product=1
    if(n==0 or n==1):
        return(1)
    else:
        for i in range(1,n+1):
            product=product*i
        return(product)    
    
a=int(input("enter ur no.: ")) 
sum=0
for j in range(1,a+1):
    b=fact(j)
    sum=sum+(j**j/b)
print(sum)    





def add(list):
    sum=0
    for i in list:
        sum=sum+i
    return(sum) 

print(add([23,45,67,78]))

