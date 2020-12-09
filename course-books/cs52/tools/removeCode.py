fin = open('u1.md')

startCodeBlock = "```java"
endCodeBlock = "```"

isInCodeBlock = False
result = ""
for line in fin:    
    if line.startswith(startCodeBlock):
       isInCodeBlock = True
    elif line.startswith(endCodeBlock):
        isInCodeBlock = False
    elif isInCodeBlock:
        result += '\n'
        continue
    
    result += line
fin.close()

fout = open('u1.test.md', 'w')
fout.write(result)
fout.close()