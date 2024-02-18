import sqlite3
from tkinter import *

root = Tk()
frame = Frame(root,width=500,height=500,bg='grey')
frame.pack()

zag = ['ФИО','Паспорт','Номер телефона','Этаж и колличество комнат','Цена','Дата и время прибытия','Датаи время отбытия']
entry = []
label = []




def create_table():
    con = sqlite3.connect('DB.db')
    cur = con.cursor()

    cur.execute('''
CREATE TABLE IF NOT EXISTS Hotel (
FIO TEXT,
Passport TEXT,
NumberPhone INTEGER,
FloorAndPlaces  TEXT,
Price TEXT,
ArrivalDateAndTime TEXT,
DepartureDateAndTime TEXT
)
''')

    con.commit()
    con.close()

def add_table():
    t = []
    for i in range(len(zag)):
        t.append(entry[i].get())
    print(t)

    con = sqlite3.connect('DB.db')
    cur = con.cursor()

    cur.execute('INSERT INTO Hotel (FIO, Passport, NumberPhone, FloorAndPlaces, Price, ArrivalDateAndTime, DepartureDateAndTime) VALUES (?,?,?,?,?,?,?)',(t[0], t[1], int(t[2]), t[3], t[4], t[5], t[6]))

    con.commit()
    con.close()

def selects():
    con = sqlite3.connect('DB.db')
    cur = con.cursor()

    cur.execute('SELECT * FROM Hotel')
    data = cur.fetchall()

    print(data)

for i in range(len(zag)):
    e = Entry(master=frame)
    e.place(x=200,y=20 + i * 30)

    l = Label(master=frame,text=zag[i],bg='grey',fg='light green',font='Arial 10')
    l.place(x=10,y=20 + i * 30)

    entry.append(e)
    label.append(l)

btn1 = Button(master=frame,text='Сохранить',command=add_table,bg='grey')
btn2 = Button(master=frame,text='Посмотреть',command=selects,bg='grey')

btn1.place(x=20,y=300)
btn2.place(x=150,y=300)

if __name__ == '__main__':
    create_table()
    root.mainloop()
