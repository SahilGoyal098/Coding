#name=int(input("enter your number"))
#for i in range(1,name+1):
 #   print(str(i))
#print(type(str(i)))
name=int(input("enter your number"))
for i in range(2,name):
    if(name%i==0):
        prime=False
        break    
    else:
        prime=True               
         
if (prime==True):
    print("no.is prime")
else:
    print('no.is not prime')             
i=0
while (i<=10):
    i=i+1
    print(i,end="\t")
