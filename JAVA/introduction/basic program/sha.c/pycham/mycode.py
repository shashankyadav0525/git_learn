from socket import if_nameindex
from tkinter import*


class libraryManagementSystem:
    def _init_(self,root):
       self.root=root
       self.root.title("library Management System")
       self.root.geometry("1550*800+0+0")


       lbltitle=Label(self.root,text="LIBRARY MANAGEMENT SYSTEM",bg="powder blue",fg="green"bd=20,relief=PRIDE,font=("times new roman",so,"bold"),padx=2,pady=6)
       lbltitle.pack(side=TOP,fill=x)

       if_nameindex=="_main_":

    root=Tk()
    obj+LibraryManagementSystem(root)
    root.mainloop()