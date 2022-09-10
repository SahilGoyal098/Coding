from tkinter import*
root=Tk()
def myfunc():
    print("button is clicked")

root.geometry("700x400")
root.title("GUI")
Label(text="hello").grid()
Button(root,text="click me",bg="black",fg="white",command=myfunc).grid(row=1,column=0)
root.mainloop()


from tkinter import*
root=Tk()
def myfunc():
    print("button is clicked")

def getvalue():
    print(entry.get())

root.geometry("700x400")
root.title("GUI")
Label(text="hello").grid()
Button(root,text="click me",bg="black",fg="white",command=myfunc).grid(row=1,column=0)
Label(text="username").grid(row=2,column=0)
entry=Entry(root)
entry.grid(row=2,column=1)
Button(text="click here",bg="black",fg="white",command=getvalue).grid(row=3)
r1=IntVar()
r2=IntVar()
r3=IntVar()
a=Radiobutton(root,text="first",variable=r1).grid(row=4)
b=Radiobutton(root,text="second",variable=r2).grid(row=4,column=1)
c=Radiobutton(root,text="third",variable=r3).grid(row=4,column=2)

root.mainloop()








