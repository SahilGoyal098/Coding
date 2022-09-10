#a=[1,2,3,4,5]
#a.append([1,2])
#a.extend([1])
#print(a)
#num=int(input("enter your numnber:/n"))
#sahil=1
#for i in range(1,num+1):
 #   sahil=sahil*i
#print(sahil)
f=open('ayush.txt',"r")
a=f.read()
f.close()
print(len(a))
