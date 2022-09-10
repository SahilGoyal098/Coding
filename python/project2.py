from tkinter import*

root=Tk()
root.geometry("550x300")
root.title("webpage")
lbx=Listbox(root)
for i in range(1,6):
    lbx.insert(END,i)
lbx.pack()
root.mainloop()



from tkinter import*

root=Tk()
root.geometry("550x300")
root.title("scrollbar")
#Label(root,text="welcome").pack()
scrollbar=Scrollbar(root)
scrollbar.pack(side=RIGHT,fill="y")
a=Listbox(root,yscrollcommand=scrollbar.set)
for i in range(1,120):
    a.insert(END,i)
a.pack()   
scrollbar.config(command=a.yview)

root.mainloop()
    