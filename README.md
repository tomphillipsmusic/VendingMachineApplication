Vending Machine Software

As part of Tech Elevator's curriculum, I was assigned a project to create software for a hypothetical new vending machine (Vendo-Matic 800) that is integrated with everyone’s bank accounts allowing customers to purchase products right from their computers for convenience sake. It was coded entirely in Java and features a number of JUnit tests. This project was a great practice in creating a structured outline and plan based off a list of requirements. Additionally, this application taught me the importance of testing each step of code in the moment versus testing everything at the end.

The features of the application are listed below:

The vending machine dispenses beverages, candy, chips, and gum. a. Each vending machine item has a Name and a Price.
A main menu displays when the software is run that presents the following options:
(1) Display Vending Machine Items
(2) Purchase
(3) Exit

Vending machine inventory is stocked via an input file when the vending machine is started..
The vending machine is automatically restocked each time the application runs.
When the customer selects (1) Display Vending Machine Items they are presented a formatted list of all items in the vending machine, their prices, and remaining stock.

a. Each vending machine product has a slot identifier and a purchase price.
b. Each slot in the vending machine has enough room for 5 of that product.
c. Every product is initially stocked to the maximum amount.
d. A product which has run out should indicate it is SOLD OUT.
When the customer selects (2) Purchase they are guided through the purchasing process menu:

(1) Feed Money
(2) Select Product
(3) Finish Transaction

Current Money Provided: $0.00

The purchase process flow is as follows
  a. By Selecting (1), a customer can repeatedly feed money into the machine in valid whole dollar amounts (e.g. $1, $2, $5, $10).
    i. The Current Money Provided indicates how much money the customer has fed into the machine.
  b. Selecting (2) allows the customer to select a product to purchase.
    i. Shows the list of products available and allow the customer to enter to code to select an item
    ii. If the product code does not exist, the customer is informed and returned to the Purchase menu.
    iii. If a product is sold out, the customer is informed and returned to the Purchase menu.
    iv. If a valid product is selected it is dispensed to the customer.
    v. Dispensing an item will print the item name, cost and the money remaining. Dispensing will also return a message.
      All chip items will print “Crunch Crunch, Yum!”
      Al l candy items will print “Munch Munch, Yum!”
      All drink items will print “Glug Glug, Yum!”
      All gum items will print “Chew Chew, Yum!”
    vi. After the product is dispensed, the machine updates its balance accordingly and returns the customer to the Purchase menu.
  c. Selecting (3) allows the customer to complete the transaction and receive any remaining change back.
    i. The customer’s money is returned using pennies, nickels, dimes, and quarters (using the smallest amount of coins possible).
    ii. The machine’s current balance should be updated to $0 remaining.
  d. After the purchase is complete the user is returned to the “Main” menu to continue using the vending machine
All purchases must be audited to prevent theft from the vending machine
  a. Each purchase generates a line in a file called Log.txt
  b. The audit entry is in the format:
    01/01/2016 12:00:00 PM FEED MONEY: $5.00 $5.00
    01/01/2016 12:00:15 PM FEED MONEY: $5.00 $10.00
    01/01/2016 12:00:20 PM Crunchie B4 $10.00 $8.50
    01/01/2016 12:01:25 PM Cowtales B2 $8.50 $7.50
    01/01/2016 12:01:35 PM GIVE CHANGE: $7.50 $0.00

