'''

  * Class: 44-141 Computer Programming I

  * Author: Andrew Atkins
  
  * Description: Project for Module 6
  
  * Due: 11-17-22

  * I pledge that I have completed the programming assignment independently.
  
  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.

'''
import os

#validate file path/ file name
def validate_file(file_path):
    """Check if the file exists."""
    if not os.path.isfile(file_path):
        raise FileNotFoundError(f"The file '{file_path}' does not exist.")
    return file_path

#Create Functions
def encrypt():
    try:
        #open files
        encryptFile=input(str("Enter file to encrypt:"))
        encryption=open(encryptFile, "r")
        
        #read the file
        encryptstring=encryption.read()
        
        #write to the output file
        outputFile=input("Enter output file:")
        output=open(outputFile, "w")
        
        #Create variables for for loops
        encryptList=[]
        str1=""
        count=0
        bag=list(encryptstring)
        
        #Create for loop to get the ord- the spot in the list
        for x in bag:
            ASCII=ord(x)-count
            encryptList.append(ASCII)
            count+=1
            
        #For loop to write to the output file
        for h in encryptList:
            asciiList=""
            asciiList+=str(h)+"."
            output.write(asciiList)
        encryption.close()
        output.close()
        
        #return the output file name
        return outputFile
    except FileNotFoundError as e:
        print(e)
    except Exception as e:
        print(f"An error occurred: {e}")
        
        
def decrypt():
    
    #Create variables
    decryptedList=[]
    count=0
    password=""
    
    #Open files that the operator wants
    decryptFile=input("Enter file to decrypt:")
    decryption=open(decryptFile, "r")
    
    #open Users output file
    outputFile=input("Enter output file:")
    output=open(outputFile, "w")
    
    #Create for loop to split up the letters
    for line in decryption:
        decryptedList=line.split(".")
    decryptedList.pop()
    
    #Change the ascii values back to letters
    for num in decryptedList:
        ASCII=int(num)+ count
        password+=chr(ASCII)
        count+=1
        
    #write to the output file
    output.write(password)
    
    #close the input and output files
    decryption.close()
    
    output.close()
    #return the name of the file
    
    return outputFile
    except FileNotFoundError as e:
        print(e)
    except Exception as e:
        print(f"An error occurred: {e}")
        

#Main Program
#prompt the user for input
choices=input(str("Welcome to the password encryption program!\nOptions:\n< e for encryption>\n< d for decryption>\n< q to exit>\nSelect an option: "))
choices=choices.lower()

#Create a while loop regarding choices
while(choices!="q"):
    
    #if statement about e
    if(choices=="e"):
        print("Encrypted passwords wrote to", encrypt())
        choices=input(str("Options:\n< e for encrption>\n< d for decryption>\n< q to exit>\nSelect an option: "))
        
    #if statement for d
    if(choices=="d"):
        print("Decrypted passwords wrote to", decrypt())
        choices=input(str("Options:\n< e for encrption>\n< d for decryption>\n< q to exit>\nSelect an option: "))
        
#When the User would Like to quit
        
if(choices=='q'):
    print("Thank you for using our program!")