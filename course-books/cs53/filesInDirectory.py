import os

def getTitle(file):
    isPreviousUpperOrSpace = True
    result = ""
    for c in file:
        if c.isupper() and isPreviousUpperOrSpace == False:
            result += " "
        result += c

        if c.isupper() or c.isspace():
            isPreviousUpperOrSpace = True
        else:
            isPreviousUpperOrSpace = False
    return result

dirpath = os.path.abspath(os.curdir)
files = os.listdir(dirpath)
for file in files:
    title = getTitle(file)
    print(f'    * [{title}](T1/{file})    ')
