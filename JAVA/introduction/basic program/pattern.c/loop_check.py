from tkinter import *
from tkinter import ttk
import random
from datetime import datetime
import tkinter.messagebox


class Library:
    def _init_(self, root):
        self.root = root
        self.root.title("Library MAnagement System")
        self.root.geometry("1350x750+0+0")
        self.root.configure(background='powder blue')

        MType = StringVar()
        Ref = StringVar()
        Title = StringVar()
        Firstname = StringVar()
        Surname = StringVar()
        Address1 = StringVar()
        Address2 = StringVar()
        PostCode = StringVar()
        MobileNo = StringVar()
        BookID = StringVar()
        BookTitle = StringVar()
        BookType = StringVar()
        Author = StringVar()
        DateBorrowed = StringVar()
        DateDue = StringVar()
        SellingPrice = StringVar()
        LateReturnFine = StringVar()
        DateOverDue = StringVar()
        DaysOnloan = StringVar()
        Prescription = StringVar()

        def iExit():
            iExit = tkinter.messagebox.askyesno("Library Management System", 'Confirm if you want exit')


        ''' =========================FrAME======================================='''
        MainFrame=Frame(self.root)
        MainFrame.grid()

        TitleFrame = Frame(MainFrame,width=1350,padx=20,bd=20,relief=RIDGE)
        TitleFrame.pack(side=TOP)

        self.lblTitle=Label(TitleFrame,width=39,background='red',font=('arial',40,'bold'),text="\tLibrary management Systems\t",padx=8)
        self.lblTitle.grid()
        ButtonFrame =Frame(MainFrame, bd=20, width=1350, height=50,padx=20,relief=RIDGE,background="blue")
        ButtonFrame.pack(side=BOTTOM)

        FrameDetail = Frame(MainFrame,bd=20,width=1350 ,height=100,padx=20,relief=RIDGE)
        FrameDetail.pack(side=BOTTOM)

        DataFrame = Frame(MainFrame, bd=20, width=1300, height=500, padx=20, relief=RIDGE,background='purple')
        DataFrame.pack(side=BOTTOM)

        DataFrameLeft=LabelFrame(DataFrame,bd=10,width=1200,height=600,padx=20,relief=RIDGE,background='brown'
                                 ,font=('arial',12,'bold'),text="Library Membership info")
        DataFrameLeft.pack(side=LEFT)

        DataFrameRight = LabelFrame(DataFrame, bd=10, width=450, height=300, padx=20, relief=RIDGE,background='grey'
                                   , font=('arial', 8, 'bold'), text="Book Details :")
        DataFrameRight.pack(side=RIGHT)

        self.lblMemberType = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Member Type:", padx=1, pady=1,background='brown')
        self.lblMemberType.grid(row=1,column=0, sticky=W)

        self.cboMemberType = ttk.Combobox(DataFrameLeft, font=('arial', 8, 'bold'), state='readonly', width=20,background='brown')
        self.cboMemberType['value'] = ('', 'Student', 'Lecturer', 'Admin Staff')
        self.cboMemberType.current(0)
        self.cboMemberType.grid(row=1, column=1)

        self.lblBookID = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Book ID:", padx=1, pady=1,background='brown')
        self.lblBookID.grid(row=1,column=2, sticky=W)
        self.txtBookID = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtBookID.grid(row=1,column=3)

        self.lblRef = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Reference No:", padx=2, pady=2,background='brown')
        self.lblRef.grid(row=3,column=0, sticky=W)
        self.txtRef = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtRef.grid(row=3,column=1)

        self.lblBookTitle = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Book Title:", padx=2, pady=2, background='brown')
        self.lblBookTitle.grid(row=0,column=0, sticky=W)
        self.txtBookTitle = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtBookTitle.grid(row=0,column=1)

        self.lblTitle = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Title:", padx=2, pady=2, background='brown')
        self.lblTitle.grid(row=2,column=0, sticky=W)

        self.cboTitle = ttk.Combobox(DataFrameLeft, state='readonly', font=('arial', 8, 'bold'), width=23)
        self.cboTitle['value'] = ('', 'Mr.', 'Miss.', 'Mrs.', 'Dr.', 'Capt.', 'Ms.')
        self.cboTitle.current(0)
        self.cboTitle.grid(row=2,column=1)

        self.lblAuthor = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Author:", padx=2, pady=2,background='brown')
        self.lblAuthor.grid(row=0,column=2, sticky=W)
        self.txtAuthor = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtAuthor.grid(row=0,column=3)

        self.lblFirstname = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Firstname:", padx=2, pady=2,background='brown')
        self.lblFirstname.grid(row=3,column=2, sticky=W)
        self.txtFirstname = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtFirstname.grid(row=3,column=3)

        self.lblDateBorrowed = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Date Borrowed:", padx=2, pady=2,background='brown')
        self.lblDateBorrowed.grid(row=2,column=2, sticky=W)
        self.txtDateBorrowed = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtDateBorrowed.grid(row=2,column=3)

        self.lblSurname = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Surname:", padx=2, pady=2,background='brown')
        self.lblSurname.grid(row=4,column=0, sticky=W)
        self.txtSurname = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtSurname.grid(row=4,column=1)

        self.lblDateDue = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Date Due:", padx=2, pady=2,background='brown')
        self.lblDateDue.grid(row=4,column=2, sticky=W)
        self.txtDateDue = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtDateDue.grid(row=4,column=3)

        self.lblAddress1 = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Address 1:", padx=2, pady=2,background='brown')
        self.lblAddress1.grid(row=4,column=0, sticky=W)
        self.txtAddress1 = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtAddress1.grid(row=4,column=1)

        self.lblDaysOnLoan = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Days On Loan:", padx=2, pady=2,background='brown')
        self.lblDaysOnLoan.grid(row=4,column=2, sticky=W)
        self.txtDaysOnLoan = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtDaysOnLoan.grid(row=4,column=3)

        self.lblAddress2 = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Address 2:", padx=2, pady=2,background='brown')
        self.lblAddress2.grid(row=6,column=0, sticky=W)
        self.txtAddress2 = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtAddress2.grid(row=6,column=1)

        self.lblLateReturnFine = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Late Return Fine:", padx=2,background='brown',
                                       pady=2)
        self.lblLateReturnFine.grid(row=6,column=2, sticky=W)
        self.txtLateReturnFine = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtLateReturnFine.grid(row=6,column=3)

        self.lblPostCode = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Post Code:", padx=2, pady=2,background='brown')
        self.lblPostCode.grid(row=7,column=0, sticky=W)
        self.txtPostCode = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtPostCode.grid(row=7,column=1)

        self.lblDateOverDue = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Date Over Due:", padx=2, pady=2,background='brown')
        self.lblDateOverDue.grid(row=7,column=2, sticky=W)
        self.txtDateOverDue = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtDateOverDue.grid(row=7,column=3)

        self.lblMobileNo = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Mobile No:", padx=2, pady=2,background='brown')
        self.lblMobileNo.grid(row=8,column=0, sticky=W)
        self.txtMobileNo = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtMobileNo.grid(row=8,column=1)

        self.lblSellingPrice = Label(DataFrameLeft, font=('arial', 8, 'bold'), text="Selling Price:", padx=2, pady=2,background='brown')
        self.lblSellingPrice.grid(row=8,column=2, sticky=W)
        self.txtSellingPrice = Label(DataFrameLeft, font=('arial', 8, 'bold'), width=20)
        self.txtSellingPrice.grid(row=8,column=3)

        ''' =========================Widget======================================='''
        self.btnDisplayDataR = Text(DataFrameRight, font=('arial', 12, 'bold'), width=32, height=13, padx=8, pady=20,background='brown')
        self.btnDisplayDataR.grid(row=0, column=2)
        ''' =========================Listbox======================================='''
        scrollbar = Scrollbar(DataFrameRight)
        scrollbar.grid(row=0, column=1, sticky='ns')

        ListofBooks = ['ds', 'discrete', 'python', 'communication', 'digital electronics', 'COA', 'Human Value',
                       'Mini Project']

        booklist = Listbox(DataFrameRight, width=20, height=12, font=('arial', 12, 'bold'))
        booklist.bind('<<ListboxSelect>>')
        booklist.grid(row=0, column=0, padx=5)
        scrollbar.config(command=booklist.yview)

        for items in ListofBooks:
            booklist.insert(END, items)
            ''' ================================================================================'''
            self.lblLabel = Label(FrameDetail, font=('arial', 10, 'bold'), pady=8,
                                  text="Member Type\tReference No.\t Title\t Firstname\t Surname\t Address 1\t Address 2\t Post Code\t Book Title\t Date Borrowed\t Days On Loan", )
            self.lblLabel.grid(row=1, column=0)

            self.txtDisplayR = Text(FrameDetail, font=('arial', 12, 'bold'), width=141, height=4, padx=2, pady=4)
            self.txtDisplayR.grid(row=1, column=0)
        ''' =========================Button======================================='''

        self.btnDisplayData = Button(ButtonFrame, text='Display Data', font=('arial', 12, 'bold'), width=30, bd=4)
        self.btnDisplayData.grid(row=0, column=0)

        self.btnDelete = Button(ButtonFrame, text='Delete', font=('arial', 12, 'bold'), width=30, bd=4)
        self.btnDelete.grid(row=0, column=1)

        self.btnReset = Button(ButtonFrame, text='Reset', font=('arial', 12, 'bold'), width=30, bd=4)
        self.btnReset.grid(row=0, column=2)

        self.btnExit = Button(ButtonFrame, text='Exit', font=('arial', 12, 'bold'), width=30, bd=4, command=iExit)
        self.btnExit.grid(row=0, column=3)


#=========================================
if _name_ == '_main_':
    root = Tk()
    application = Library(root)
    root.mainloop()