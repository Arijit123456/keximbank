Feature:login and branchcreation
Scenario:validate the login functionalities
Given    launch the site 
When     Enter the data with "Admin" data and password with "Admin" and click on login btn
Then     Branches shold be displayed
Then     close  site


Scenario Outline: validate branch creation with multiple data
Given     launch the site
When      Enter the username with "Admin" data and password with "Admin" and click on login btn
Then      Branches should be displayed
Then      click on newbranch and create the branch with "<branch_name>" and "<address>" and "<zipcode>" and "<country>" and "<state>" and "<city>"
Then      close site

Examples: 
          |branch_name|address  |zipcode|country|state|city|
          |marthalli56|btmlayout|67890  |INDIA  |GOA  | GOA|
          