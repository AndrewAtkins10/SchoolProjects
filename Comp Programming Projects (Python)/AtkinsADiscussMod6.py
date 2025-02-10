'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins
  
  * Description: Module 6 discussion post
  
  * Due: 11-14-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
#define functions
def averageGPA(listofGPA):
    total=0
    average=0
    count=0
    for x in listofGPA:
        total+=float(x)
        count+=1
    average=total/count
    return(format(average, ".2f"))
#main program
readFile= open("input.txt","r")
stuNames=[]
gpaList=[]
for line in readFile:
    stuNames.append(line[:line.find(" "):])
    gpaList.append(line[line.find(" ")+1:line.find("\n")])
#Output
print("The average GPA is:",averageGPA(gpaList))
