import string
import random

if __name__ == "__main__":
    s1 = string.ascii_lowercase
    # print(s1)
    s2 = string.ascii_uppercase
    # print(s2)
    s3 = string.digits
    # print(s3)
    s4 = string.punctuation
    # print(s4)
    plen = int(input("Enter password length\n")) #Todo1: Handle Gibberish
    s = []
    s.extend(list(s1))
    s.extend(list(s2))
    s.extend(list(s3))
    s.extend(list(s4))
    # print(s)
    # random.shuffle(s)
    # print(s)
    print("Your password is: ")
    print("".join(random.sample(s, plen)))
    # print("".join(s[0:plen]))
import pandas as pd
import datetime
import smtplib
import os
os.chdir(r"D:\MyData\Business\code playground\Python Practice Programs\birthday wisher")
# os.mkdir("testing") 

# Enter your authentication details
GMAIL_ID = ''
GMAIL_PSWD = ''


def sendEmail(to, sub, msg):
    print(f"Email to {to} sent with subject: {sub} and message {msg}" )
    s = smtplib.SMTP('smtp.gmail.com', 587)
    s.starttls()
    s.login(GMAIL_ID, GMAIL_PSWD)
    s.sendmail(GMAIL_ID, to, f"Subject: {sub}\n\n{msg}")
    s.quit()
    

if __name__ == "__main__":
    #just for testing
    # sendEmail(GMAIL_ID, "subject", "test message")
    # exit()

    df = pd.read_excel("data.xlsx")
    # print(df)
    today = datetime.datetime.now().strftime("%d-%m")
    yearNow = datetime.datetime.now().strftime("%Y")
    # print(type(today))
    writeInd = []
    for index, item in df.iterrows():
        # print(index, item['Birthday'])
        bday = item['Birthday'].strftime("%d-%m")
        # print(bday) 
        if(today == bday) and yearNow not in str(item['Year']):
            
            sendEmail(item['Email'], "Happy Birthday", item['Dialogue']) 
            writeInd.append(index)

    # print(writeInd)
    for i in writeInd:
        yr = df.loc[i, 'Year']
        df.loc[i, 'Year'] = str(yr) + ', ' + str(yearNow)
        # print(df.loc[i, 'Year'])

    # print(df) 
    df.to_excel('data.xlsx', index=False)   '''
Create a python program to secure an existing password by replacing a set of characters with the corresponding 'password-secure' character (Provided as tuple).
Example:
    SECURE = (('s', '$'), ('and', '&'), 
            ('a', '@'), ('o', '0'), ('i', '1'),
            ('I', '|'))

    Input:
    password = "Indians123"

    Output:
    Your secure password is |nd1@n$123

'''


SECURE = (('s', '$'), ('and', '&'), 
            ('a', '@'), ('o', '0'), ('i', '1'),
            ('I', '|'))

def securePassword(password):
    for a,b in SECURE:
        password = password.replace(a, b)
    return password

if __name__ == "__main__":
    password = input("Enter your password\n")
    password = securePassword(password)
    print(f"Your secure password is {passward}")