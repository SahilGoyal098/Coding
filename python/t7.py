name=input("enter your name\n")
name=name.upper()
print(name)# upper() used to convert string in capital words


word=input("enter any key")
print(word.lower())# lower() used to covert string in small letters


a=input("enter any key" )   #isdigit(),isalpha(),isspace() applied only on string not on int  and float
if(a.isdigit()):            #isalpha()used to check user entered value is all character or not
    print("it is number")
elif(a.isalpha()):
    print("it is character")
elif(a.isspace()):
    print("it is space")
else:
    print("it is anything except these")   


l1=["harry","sahil","ayush","aditya"]
name=l1[0]
word=name[0:4]
print(word.upper())



a=input("press any key  ")
if(a.isalpha() and a.isupper()):
    print("uppercase ch is entered")
elif(a.isalpha() and a.islower()):
    print("lowercase ch is entered")
elif(a.isdigit()):
    print("it is number")
else:
    print("wrong")        