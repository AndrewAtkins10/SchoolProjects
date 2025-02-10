'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins
  
  * Description: Project for Module 5
  
  * Due: 11-2-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
#Define funtions
def fileReader(lastName,fileInput):
    file=open(fileInput,"r")
    for x in file:
        if(lastName.lower() in x.lower()):
            name=x;
            return(name)
    return("Student not found")
def firstName(studentInfo):
    first=studentInfo[:studentInfo.index(" ")]
    return (first)
def lastName(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    last=line[:line.index(" ")]
    return (last)
def gpa(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    line=line[line.index(" ")+1:]
    gpa=line[:line.index(" ")]
    return (gpa)
def creditHours(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    credithours=line[:line.index(" ")]
    return(credithours)
def mealPlan(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    mealplan=line[:line.index(" ")]
    return(mealplan)
def advisor(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    advisor=line[:line.index(" ")]
    return(advisor)
def enrollmentSubmit(studentInfo):
    line=studentInfo[studentInfo.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    line=line[line.index(' ')+1:]
    enrollment=line[:line.index('')]
    submission=line[:]
    if("True"in line):
        return(lastName(studentInfo) +" has enrolled")
    elif("False" in line):
        return(lastName(studentInfo) +" has not enrolled")
fileInput= open("studentInfo.txt","r")
print("Welcome to the Enrsuollment Center!")
prompt=str(input("Please enter a last name or enter 0 to stop the program:"))
while(prompt!="0"):
    x=fileReader(prompt, "studentInfo.txt")
    if(x!="Student not found"):
        print()
        print(firstName(x), lastName(x), "has a",gpa(x),"gpa")
        print("Credit Hours:",creditHours(x))
        print("Meal Plan:", mealPlan(x))
        print(firstName(x) +"'s "+"advisor is", advisor(x))
        print(enrollmentSubmit(x))
    else:
        print(x)
    prompt=str(input("Please enter a last name or enter 0 to stop the program:"))
fileInput.close()