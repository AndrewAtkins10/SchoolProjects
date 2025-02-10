'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins
  
  * Description: Discusion Post for Module 5
  
  * Due: 10-31-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''

def calcAvg(exam1, exam2, exam3, exam4):
    avgScore= (exam1+exam2+exam3+exam4)/4
    return avgScore
def grade(average):
    if(average>=90):
        print("A")
    if(average>=80 and average<90):
        print('B')
    if(average>=70 and average<80):
        print('C')
    if(average>=60 and average<70):
        print('D')
    if(average<60):
        print('F')
examScore1=float(input("Enter Exam 1 score:"))
examScore2=float(input("Enter Exam 2 score:"))
examScore3=float(input("Enter Exam 3 score:"))
examScore4=float(input("Enter Exam 4 score:"))
print("The average of the exams scores is:", calcAvg(examScore1, examScore2, examScore3, examScore4))
avgExam=calcAvg(examScore1, examScore2, examScore3, examScore4)
grade(avgExam)

