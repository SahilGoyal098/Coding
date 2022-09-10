#to print pattern
for i in range(1,6):
    print("pass",i,"-",end="")
    for j in range(1,6):
        print(j,end="")
    print()      


#to print pattern
for i in range(1,6):
    print()
    for j in range(1,i+1):
        print(j,end="")



# to print pattern
for i in range(1,6):
    print()
    for j in range(1,i+1):
        print(i,end="")



# to print pattern


#to print pattern 
n=int(input("enter your no."))
for i in range(1,n+1):        
    for m in range(n,i,-1):
        print(" ",end="")
    for k in range(1,i+1):
        print(k,end="")
    for j in range(i-1,0,-1):
        print(j,end="")
    print()     



for i in range(5):
    print(i,end="")       