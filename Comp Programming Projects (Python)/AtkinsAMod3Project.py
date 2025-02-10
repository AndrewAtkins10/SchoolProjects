'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins

  * Description: Project for Module 3
  
  * Due: 10-6-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
import random
#priming read for the user
print("Determine the minimum, maximum, or average of the minimum salary of different tech jobs. What would you like to calculate?")
choice=int(input("Enter 1 for min, 2 for max, 3 for average, or 0 to quit:"))
count=0
minimum=0
maximum=0
total=0
minsalary=0
maxsalary=0
#create while loop for themenu choices

while(choice!=0):
    title=str(input("Enter the job title name or quit to exit:"))
    while('quit'not in title):
        salary=random.randint(10000,19999)
        if(choice==1):
            #calulate min
            if(count==0):
                minimum=salary
                mintitle=title
            if(salary<minimum):
                minimum=salary
                mintitle=title
        #calculate max
        if(choice==2):
            if(count==0):
                maximum=salary
                maxtitle=title
            if(salary>maximum):
                maximum=salary
                maxtitle=title
        #calculate average
        if(choice==3):
            total+=salary
        count+=1
        print("the salary is:", salary)
        title=str(input("Enter the job title name or quit to exit:"))
#Create another if statement regarding the quit
    if ('quit' in title):
        #print statements for when the quit for max min and average
        if(choice==1):
            print("The minimum wage of the jobs entered is:")
            print("Job Title:", mintitle)
            print("Salary:", format(minimum,'.1f'))
        if(choice==2):
            print("The maximum wage of the jobs entered is:")
            print("Job Title:", maxtitle)
            print("Salary:", format(maximum,'.1f'))
        if(choice==3):
            average=total/count
            print("The average wage of the jobs entered is:")
            print("Job Title:", format(average,'.1f'))
        print("Determine the minimum, maximum, or average of the minimum salary of different tech jobs. What would you like to calculate?")
        choice=int(input("Enter 1 for min, 2 for max, 3 for average, or 0 to quit:"))
#end
if(choice==0):
    print("Thank you!")


