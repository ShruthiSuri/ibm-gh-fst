# import json as js
# with open('currency.json','r') as myfile:
#      fileobject = js.load(myfile)
#     #  print(fileobject)

# # json.load() was designed to work with streams

# # The json module is part of Python's standard library. Its load() function expects something 
# # that has a .read() method, such as a file object. 

# # loads()-->whole data and load()->line by line
# print(fileobject.keys())

# --------------------------------------------------------------------------
import json as js

with open('currency.json', 'r') as myfile:
    data = myfile.read()

fileobject = js.loads(data)
print(fileobject)


# file = open("currency.json", "r")
# data = file.read()
# file.close()

# print(data)