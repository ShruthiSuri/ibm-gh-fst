import pandas as pd
# data=pd.DataFrame([[1.3, 1.4, 5.2],
#                    [2.6, 1.4, 4.6],
#                    [2.1, 5.6, 4.6]],
#                   columns=['A', 'B', 'C'],
#                   index=['X', 'Y', 'Z'])
# print(data)
# data.to_xml('xmlwrite.xml')

pd.DataFrame([[1.3, 1.4, 5.2],
                   [2.6, 1.4, 4.6],
                   [2.1, 5.6, 4.6]],
                  columns=['A', 'B', 'C'],
                  index=['X', 'Y', 'Z']).to_xml('xmlwrite1.xml')