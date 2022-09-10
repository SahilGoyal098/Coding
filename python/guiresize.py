from tkinter import*
root=Tk()
root.geometry("700x600")
root.maxsize(900,700)
root.title("one piece")
root.iconbitmap("favicon.ico")
def update():
    root.geometry(f"{a.get()}x{b.get()}")
a=StringVar()
b=StringVar()
width=Entry(root,textvariable=a)
width.pack()
height=Entry(root,textvariable=b)
height.pack()
Button(root,text="update size",command=update).pack()


root.mainloop()