import pandas as pd
data={
    "Usernames":["admin","Charles","deku"],
    "Password":["password","Charl13","AllMight"]
}

print(data)
dataframe=pd.DataFrame(data)
print(dataframe)

	
"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("Accounts.csv",index=False)