from tkinter import*

from numpy import kaiser
root=Tk()
root.geometry("678x456")
a=Label(text="mmmm",fg="white",bg="black",pady=15)
a.pack()
root.mainloop()



from tkinter import*
root=Tk()
b=600
c=700
root.geometry(f"{c}x{b}")
a="sahil"
a="hello"
Label(text=a).pack()
root.mainloop()




from tkinter import*
root=Tk()
root.geometry("700x600")
root.title("Death note")
def num(event):
    print("hh")
frame=Frame(root,bg="black")

a=Button(frame,text="hello")
a.pack(side=LEFT)
a.bind("<Button-1>",num)
b=Button(frame,text="quit")
b.pack(side=LEFT)
b.bind("Button-2",num)
frame.pack()
root.mainloop()





from tkinter import*
root=Tk()
root.geometry("700x600")
root.title("Death note")
def magic(event):
    
    text=event.widget.cget("n")
    
    a.set(text)

    
a=StringVar()
a.set("hh")
Entry(root,textvariable=a).pack()
b=Button(root,text="change")
b.bind("<Button-1>",magic)
b.pack()

root.mainloop()



