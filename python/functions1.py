
def maximum(num1,num2,num3):
    if(num1>num2 and num1>num3):
        return(num1)
    elif(num2>num1 and num2>num3):
        return(num2)
    else:
        return(num3)          

#print(maximum(89,98,78))    
def factorial(n):
    product=1
    for i in range(1,n+1):
        product=product*i
    return(product)    
#print(factorial(5))
def sum(n):
    if (n==1):
        return(1)
    else:
        return(n+sum(n-1))    
#print(sum(40))        


       