import json as js
import pandas as pd

data=pd.DataFrame([[1.3, 1.4, 5.2],
                   [2.6, 1.4, 4.6],
                   [2.1, 5.6, 4.6]],
                  columns=['A', 'B', 'C'],
                  index=['X', 'Y', 'Z'])
print(data)

# data.to_json("data.json")
data.to_json("data1.json", orient="records", indent=4)

