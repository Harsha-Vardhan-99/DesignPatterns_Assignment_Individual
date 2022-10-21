# DesignPatterns_Assignment_Individual

1) Clone the Git repo from "https://github.com/Harsha-Vardhan-99/DesignPatterns_Assignment_Individual"
2) Run the project in IntelliJ
3) Facade design pattern is implemented to handle the sub functionalities like login, displaying the menu etc
4) After the project build is done you will receive a prompts asking to enter username and password.
5) Once the credentials are verified user will be taken to either buyer or seller instance which is an implementation of Bridge Design Pattern.
 Buyer Instance:
    1) When a user enters the buyer instance he will be asked to choose the type of menu.
    2) Here user enters either 1 for the meat menu or 2 for the produce menu.
    3) Then the buyer will be shown the menu of his choice using the classes produceProductMenu or meatProductMenu.
    4) Both of the classes extend the interface ProductMenu, Factory Design Pattern has been implemented in this fasion.
    5) both meatProductMenu and produceProductMenu use the ProductIterator class to iterate over the products in the ProductInfo.txt file.
    6) Iterator function in the ProductIterator class loops over the entire products and prints them in the console thus the Iterator Design Pattern has been implemented.
    7) After this state user will be given two options i.e to either take back to the choosing the menu state or logout.
    8) These tasks are taken care by the functions in VisitorReminder class which takes user to any given state in the application and hence implementing the visitor design pattern
 Seller Instance:
    1) All the steps until the menu is displayed are identical in both the instances, but seller will have an option to add product to the menu.
    2) Seller will receive a prompt asking if he would like to add a product, if Yes he will receive another prompt asking him to enter the producr name.
    3) The type of product will be taken from the type of menu he chooses.
    4) Once the product has been successfully added , he will receive options similar to buyer in the end.