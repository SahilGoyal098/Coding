l1=[1,3,"SAHIL",5.7,(1,2,3)]
l2=[2,3,6,78,"HARRY"]
l3=[2,3,4,2,2,2,5,678,879]
print(l1+l2) 
l1.append(3)
l2.extend([1,32,"goyal"])
print(l1)
print(l2)
print(max(l3))
a=sorted(l3)# gives list in ascending order
print(a)
b=set(l3)# give set in ascending order with deletion of repition of value
print(b)
print(l3.count(2))# tells how  many time a value is repeted
l1[3]="pranav"#value change at index (mutable)
print(l1)
l3.insert(5,"AIML")#insert element at given index
l3.pop(4)#remove  element from given index
print(l3)
l4=l1.copy()#copy the list
print(l4)
c=l4.index("SAHIL")#give index of given element
l4.remove("pranav")#remove element which was given
print(l4)
print (c)
print(l3[5]+10)
print(l4[0:4:2])
print(f"the length of l4 list is{len(l4)}")
print(l3*2)

#sets:

myset={1,2,2,4,3,5,"sahil",(1,2,3)}#set cannot contain mutable item
myset2={4,5,5,8,8.9}
myset.add(8)#add element (take one argument only)
print(myset)
d=set()#to print empty set otherwise dic
print(d)
myset2.remove(8)#ewmovw the element
print(myset2)
myset2.discard(9)#if elemnent not present then dont show error
print(myset2)
myset2.update([1,6,7])#add element present in list simply given value not iterable
print(myset2)
print(myset|myset2)#union
print(myset&myset2)#intersection,also use.intersection
print(myset-myset2)#set difference,also use.difference
print(myset^myset2)#set symmetric difference (in this element which is not present in both wil print)
v=myset.difference(myset2)
print(v)
myset3={1,2,3,4,4,5.6}
print(sum(myset3))
print(max(myset3))
