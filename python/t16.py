
from tkinter import*
root=Tk()
root.geometry("765x567")
root.maxsize(900,700)
Label(text="name").grid()
Label(text="gender").grid(row=1)
Label(text="phone no.").grid(row=2)
Label(text="emergency no.").grid(row=3)
username=StringVar()
a=Entry(root,textvariable=username)
a.grid(row=0,column=1)

root.mainloop()



from tkinter import*
root=Tk()
root.geometry("765x567")
root.maxsize(900,700)
can=Canvas(root,width=900,height=500,bg="grey")
can.pack()
can.create_line(70,0,70,56)
can.create_rectangle(800,400,300,500)
can.create_oval(450,200,300,400)
Button(text="click here").pack()#why button craete at bottom
root.mainloop()


from tkinter import*
root=Tk()
root.geometry("765x567")
root.maxsize(900,700)
can=Canvas(root,bg="grey",width=500,height=300)
can.pack()
can.create_line(70,0,70,56)

can.create_rectangle(10,40,20,50)
root.mainloop()



from tkinter import*
from tkinter import messagebox
root=Tk()
root.geometry("700x500")
root.maxsize(900,700)
root.title("my gui")
def help():
    print("hello")
    messagebox.showinfo("ALERT","BATTERY IS TO DIE")
    messagebox.askquestion("whats up guys felling better?")
menubar=Menu(root)
m1=Menu(menubar,tearoff=0)
m1.add_command(label="copy",command=help)
m1.add_command(label="paste")
m1.add_command(label="cut")
menubar.add_cascade(menu=m1,label="file")
root.config(menu=menubar)
root.mainloop()


from tkinter import*
from tkinter import messagebox
root=Tk()
root.geometry("700x500")
def help():
    print(f"{var.get()} is selected")
    messagebox.showinfo("ALERT","BATTERY IS TO DIE")
    messagebox.askquestion("whats up guys felling better?")

def select():

    print(f"{var2.get()} is selected")

def getvalue():
    print(f"{var3.get()} is selected")

var=IntVar()
var2=StringVar()
var3=StringVar()
r1=Radiobutton(root,text="dosa",variable=var,valu=2,command=help)    
r2=Radiobutton(root,text="idli",variable=var2,value="idli",command=select) 
r3=Radiobutton(root,text="rice",variable=var3,value=1,command=getvalue) 
r2.grid()
r1.grid(column=1)
r3.grid(column=2)
root.mainloop()




