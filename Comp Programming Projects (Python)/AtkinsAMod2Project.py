'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins

  * Description: Project for Module 2
  
  * Due: 9-22-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
#intialize variables and set constants
num_of_items_in_boxes=200
type_of_PPE=str(input("Enter the type of PPE:"))
print ("Enter the number that corresponds to the day of the week that you would like to enter",type_of_PPE,"for or 0 to quit")
num= int(input("1-Mon 2-Tues 3-Wed 4-Thurs 5-Fri:"))
#Create a sentinal loop that goes through until the operator presses 0
while(num!=0):
    #Create if statements that correlate to the numbers assiociated with days of the week
    if (num==1):
        print("Please enter the number of full boxes of",type_of_PPE,"for day 1:", end='')
        boxes_day_1=int(input(""))
    if (num == 2):
        print("Please enter the number of full boxes of",type_of_PPE,"for day 2:", end='')
        boxes_day_2=int(input(""))
    if (num == 3):
        print("Please enter the number of full boxes of",type_of_PPE,"for day 3:", end='')
        boxes_day_3=int(input(""))
    if (num == 4):
        print("Please enter the number of full boxes of",type_of_PPE,"for day 4:", end='')
        boxes_day_4=int(input(""))
    if (num == 5):
        print("Please enter the number of full boxes of",type_of_PPE,"for day 5:", end='')
        boxes_day_5=int(input(""))
    #End of while loop, must ask the operator once more to enter a new num so it is updated and doesn't run forever
    print("Enter the number that corresponds to the day of the week that you would like to enter",type_of_PPE,"for or 0 to quit")
    num= int(input("1-Mon 2-Tues 3-Wed 4-Thurs 5-Fri:"))
#Create an if statement that if the operator does press 0 it goes to another statement regarding averages, days left, and total number left
if (num == 0):
    average_boxes_per_day= (boxes_day_1 - boxes_day_5) / 4
    total_num_left= boxes_day_5 * 200
    num_of_days_left_with_supplies= (total_num_left // 200) // average_boxes_per_day
    print('Average boxes of',type_of_PPE,'used per day is:',average_boxes_per_day)
    print("Total number of",type_of_PPE,"left:",total_num_left)
    print('Number of days left of',type_of_PPE,':',round(num_of_days_left_with_supplies))