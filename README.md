# **Vending Machine Software**

As part of Tech Elevator's curriculum, I was assigned a project to create software for a hypothetical new vending machine (Vendo-Matic 800) that is integrated with customer's bank accounts allowing customers to purchase products right from their computers for convenience sake. It was coded entirely in Java in the Eclipse IDE and features a number of JUnit tests. 

## What I learned

This project was a great practice in building a complete product entirely through pair programming. Before any code was written, I made sure to draft an outline of every class required and wrote pseudocode for each method. This cut down production time tremendously because there was a plan to follow every step of the way. Additionally, this application taught me the importance of testing each step of code in the moment versus testing everything at the end. In hindsight, we created too many void methods that proved difficult to test. In the future, I will becareful to write code that is more easily testable.

## Features

1. The vending machine dispenses beverages, candy, chips, and gum. 
   -Each vending machine item has a Name and a Price.
  
2. A main menu displays when the software is run that presents the following options:

   (1) Display Vending Machine Items   
   (2) Purchase   
   (3) Exit
   
3. The ending machine inventory is stocked via an input file when the vending machine is started.
   1. The vending machine is automatically restocked each time the application runs.
   2. When the customer selects (1) they are presented a formatted list of all items in the vending machine, their prices, and remaining      stock.
   3. Each vending machine product has a slot identifier and a purchase price.
   4. Each slot in the vending machine has enough room for 5 of that product.
   5. Every product is initially stocked to the maximum amount.
   6. A product which has run out indicates it is SOLD OUT.
   
4. When the customer selects (2) Purchase they are guided through the purchasing process menu:

   (1) Feed Money
   (2) Select Product
   (3) Finish Transaction
   
  Current Money Provided: $0.00

   1. By Selecting (1), a customer can repeatedly feed money into the machine in valid whole dollar amounts (e.g. $1, $2, $5, $10).
      1. The Current Money Provided indicates how much money the customer has fed into the machine.
   2. Selecting (2) allows the customer to select a product to purchase.
      1. Shows the list of products available and allow the customer to enter to code to select an item
      2. If the product code does not exist, the customer is informed and returned to the Purchase menu.
      3. If a product is sold out, the customer is informed and returned to the Purchase menu.
      4. If a valid product is selected it is dispensed to the customer.
      5. Dispensing an item will print the item name, cost and the money remaining. Dispensing will also return a message.
      6. After the product is dispensed, the machine updates its balance accordingly and returns the customer to the Purchase menu.
   3. Selecting (3) allows the customer to complete the transaction and receive any remaining change back.
      1. The customer’s money is returned using pennies, nickels, dimes, and quarters (using the smallest amount of coins possible).
      2. The machine’s current balance should be updated to $0 remaining.
      3. After the purchase is complete the user is returned to the “Main” menu to continue using the vending machine
   
5. All purchases must be audited to prevent theft from the vending machine
   1. Each purchase generates a line in a file called Log.txt
   2. The audit entry is in the format:

    01/01/2016 12:00:00 PM FEED MONEY: $5.00 $5.00   
    01/01/2016 12:00:15 PM FEED MONEY: $5.00 $10.00  
    01/01/2016 12:00:20 PM Crunchie B4 $10.00 $8.50  
    01/01/2016 12:01:25 PM Cowtales B2 $8.50 $7.50  
    01/01/2016 12:01:35 PM GIVE CHANGE: $7.50 $0.00

