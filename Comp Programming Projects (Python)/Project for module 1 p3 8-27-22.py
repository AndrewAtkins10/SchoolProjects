'''
  * Class: 44-141 Computer Programming I

  * Author: (Andrew Atkins)

  * Description: (Project for module 1)

  * Due: (8-30-22)

  * I pledge that I have completed the programming assignment independently.

  * I have not copied the code from a student or any source.

  * I have not given my code to any other student and will not share this code with anyone under any circumstances.
'''
# Determine constant variables used later
TAX=0.052
SUPER_SHOPPER=300
#Begin by welcoming the constumer
print("***********************************")
print("* Welcome to AtkinsOnlineSuperStore.com *")
print("***********************************")
# Begin gathering data about the things they would like to purchase
item=str(input("Enter the name of the item you would like to buy:"))
item_Price=int(input("Enter the price of the item:"))
quantity=int(input("Enter the number of items:"))
contact_Name=str(input("Enter your name:"))
address=str(input("Enter shipping address:"))
# Begin calculating the Total Bill and whether they are a super shopper or not
Total_Bill=item_Price * quantity
Tax=Total_Bill * TAX
Total_Bill=Total_Bill+Tax
# Start billing information
print("******Billing information******")
print("Contact Name: Tiffany")
print("Shipping Addres: 123 North Walnut")
print("Item: Laptop")
print("Quantity: 3")
# Print the final bill and whther they are a super shopper or not
print("Tiffay the total bill for your purchase is)$",format(Total_Bill,".2f"))
print("T/F: Were you a super shopper today?", Total_Bill>SUPER_SHOPPER)
print("*****Thank You For Shopping*****")
