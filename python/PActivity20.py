import pandas as pd
data= {
  "FirstName":["Satvik","Avinash","Lahri"],
  "LastName":["Shah","Kati","Rath"],
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":[4537829158,5892184058,4528727830]
}
print(data)
dataframe=pd.DataFrame(data)
print(dataframe)
dataframe.to_excel("User.xlsx",index=False)