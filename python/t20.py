def fact(n):
    product=1
    for i in range(1,n+1):
        product=product*i
    return(product)



a=1/fact(5)
print(a)
