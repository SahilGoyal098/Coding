#l1=[1,2,3,{2:3,"harry":(1,2,3)}]
#print(l1[1:4])
#dict={(1,2,3):"harry",(2,3,4):{1,2,3}}
#print(dict)
#for i in range(1,4):
 #   print(2*i)
#l1=["sahil","harry",2,3,[1,3,4],(4,5,"aditya"),{1,2},78.9,2,4]
#l1[1]=(8,7)
#print(l1)
#tuple=(1,2,3,4,5,6,7,8)
#c=tuple[1:3]+tuple[4:6]
#print(c)
#a="my name is sahil goyal"
#print(a[1:6])
def maximum(num1,num2,num3):
    if(num1>num2 and num1>num3):
        return(num1)
    elif(num2>num1 and num2>num3):
        return(num2)
    else:
        return(num3)        
print(maximum(9,8,56))       