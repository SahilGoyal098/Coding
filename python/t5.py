#def addition(n):
 #   sum=0
  #  for i in range(1,n+1):
   #     sum=sum+i
    #return(sum)    
#print(addition(5))    
  
def sum(m):
    if (m==1):
        return(1)
    else:
        return(m+sum(m-1))   
print(sum(10))        