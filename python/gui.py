from tkinter import*

root = Tk()
root.title("hello")
root.geometry("754x456")#widthxheight
root.maxsize(1200,600)#width,height
# a=Label(text="welcome to my GUI",bg="grey",fg="white",pady=7,borderwidth=3,relief=SUNKEN,font="comicsansms 9 bold")
# a.pack( side=TOP,fill="x")
f1=Frame(root,bg="black",borderwidth=20,relief=SUNKEN,pady=17,width=200,height=100)  #why size get smaller after inserting text,padx,pady not working
f1.pack(side=LEFT)
# b=Label(f1,text="my frame",bg="yellow",padx=85,pady=12)
# b.pack(fill="y")

root.mainloop()


from tkinter import*

root = Tk()
root.title("hello")
root.geometry("754x456")
root.maxsize(1200,600)

def getvalue():
    