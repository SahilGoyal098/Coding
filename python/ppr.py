a=[1,2,0,3,1]
for i in a:
    print(a[i-2]+a[i+1])

def myfunc(n):
    if n<=1:
        return 1
    else:
        return(myfunc(n-1)+myfunc(n-2)+n**2)        

print(myfunc(4))