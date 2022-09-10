from tkinter import*
root=Tk()
root.geometry("700x900")
root.title("Calculator")
value=StringVar()
value.set("")
root.iconbitmap("Wineass-Ios7-Redesign-Calculator.ico")
def magic(event):
    text=event.widget.cget("text")
    if(text=="C"):
        value.set("")
    elif (text=="="):
        value.set(eval(value.get()))   
    else:
         value.set(value.get()+text)    
         
screen=Entry(root,textvariable=value,font="lucida 40 bold")
screen.pack(fill="x",ipadx=8,pady=10,padx=10)
f=Frame(root,bg="grey")
f.pack()
for i in range(9,6,-1):
    b=Button(f,text=f"{i}",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
    b.pack(side=LEFT)
    b.bind("<Button-1>",magic)
f2=Frame(root,bg="grey")   
f2.pack() 
for i in range(6,3,-1):
    c=Button(f2,text=f"{i}",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
    c.pack(side=LEFT)  
    c.bind("<Button-1>",magic)

f3=Frame(root,bg="grey")   
f3.pack() 
for i in range(3,0,-1):
    d=Button(f3,text=f"{i}",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
    d.pack(side=LEFT)    
    d.bind("<Button-1>",magic)
    
f4=Frame(root,bg="grey")
f4.pack()
e=Button(f4,text="0",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
e.pack(side=LEFT)
e.bind("<Button-1>",magic)
g=Button(f4,text="=",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
g.pack(side=LEFT)
g.bind("<Button-1>",magic)
h=Button(f4,text="*",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
h.pack(side=LEFT)
h.bind("<Button-1>",magic)
    
f5=Frame(root,bg="grey")
f5.pack()
i=Button(f5,text="-",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
i.pack(side=LEFT)
i.bind("<Button-1>",magic)
j=Button(f5,text="/",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
j.pack(side=LEFT)
j.bind("<Button-1>",magic)
k=Button(f5,text="C",bg="grey",fg="black",padx=30,pady=28,font="lucida 28 bold")
k.pack(side=LEFT)
k.bind("<Button-1>",magic)

    
    


root.mainloop()    