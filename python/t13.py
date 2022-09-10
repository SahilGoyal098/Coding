list=[1,2,3,4,1,2,3,56,6]
a=set(list)
print(a)

name="sahil 23 45"
print(name.split())
tuple=(3,5,6,1,2,3,4,5,6)
a=sorted(tuple)
print(a)

def check(x,y):
    if(x>y):
        return(x)
    else:
        return(y)    


l1=(1,2,3,4,5)
l2=(6,7,8,9,5)
a=list(map(check,l1,l2))
print(a) 


def even(num1):
    if(num1%2==0):
        return(num1)
    else:
        return(0)    

l2=[6,7,8,9,5]
a=list(filter(even,l2))
print(a) 

