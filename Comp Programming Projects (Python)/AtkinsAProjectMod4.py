'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins and Blake Strickland

  * Description: Project for Module 4
  
  * Due: 10-20-22

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
#promt the user for input and intialize variables
import random
count=0
letters=False
count1=0
count2=0
ranpassword=""
options=str(input("** Menu **\n'e' to enter a password to check \n'g' to generate a password or \n'q' to quit\n Enter a command:"))
# Set up while loop for value not equaling q
while(options!='q'):
    #set up ifs, elif, else for the characters in the password
    if(options=='e'):
        password=str(input("Enter your password:"))
        #For loop for the password and generate and check it through ascii
        for x in password:
            ord(x)
            if(ord(x)>=48 and ord(x)<=57):
                count1+=1
            elif(ord(x)>=65 and ord(x)<=90 or ord(x)>=97 and ord(x)<=122):
                letters=False
            else:
                letters=True
                break
            count+=1
        #Print out if the password is valid or not through if and elif
        if(count>=10 and count1>=3 and letters==False):
            print("Valid Password")
        elif(count<10):
            print("Invalid Password - password too short.")
        elif(count1<3):
            print("Invalid Password - not enough digits.")
        elif(letters==True):
            print("Invalid Password - incorrect characters.")
        #Reset varaibles and reprompt menu
        count=0
        count1=0
        letters=False
        print("Please enter a new menu choice")
        options=str(input("** Menu **\n'e' to enter a password to check \n'g' to generate a password or \n'q' to quit\n Enter a command:"))
    #Create an if statement for if options= g and prompt the user for length of the sesired password
    if(options=='g'):
        length=int(input("Enter the length of password to generate:"))
        #create a while loop to ranomly generate each letter through the chr function and ascii
        while(count2<length):
            ran=random.randint(1,3)
            if(ran==1):
                rannum=random.randint(48,57)
                ranpassword=ranpassword+chr(rannum)
                count1+=1
                count+=1
            elif(ran==2):
                ranUPletter=random.randint(65,90)
                ranpassword=ranpassword+ chr(ranUPletter)
                count+=1
            elif(ran==3):
                ranletter=random.randint(97,122)
                ranpassword=ranpassword+ chr(ranletter)
                count+=1
            count2+=1
        #print out valid password if the characters and digits are the right amount and reprompt
        if(count>=10 and count1>=3):
            print("valid password:", ranpassword,"\nPlease enter a new menu choice")
            count1=0
            count2=0
            ranpassword=""
        #if not, print out the password generated is and reprompt
        else:
            print("The password generated is:",ranpassword, "\nPlease enter a new menu choice")
            count1=0
            count2=0
            ranpassword=""
        #reprompt the user with the menu
        options=str(input("** Menu **\n'e' to enter a password to check \n'g' to generate a password or \n'q' to quit\n Enter a command:"))
#If the user enters q, the program quits and a thank you message appears
print("Thank you for using the password machine!")
        
        
        

