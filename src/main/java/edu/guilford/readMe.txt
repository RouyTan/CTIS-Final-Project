Author: Rou Yu Tan

This is a math game meant for elementary aged children. 

The Main class 
    In the Main class the JFrame is initialized. All the JPanels are also added onto the JFrame. 
    I also initialized a random generator that would produce random numbers for the math problems. 
    I included value bounds on the random number and limited the number of decimals the values have 
        (2 decimals for addition and subtraction; 0 decimals for division) 
    I also made code that produced the answers for these equations

Panel Classes
    I made 4 classes that extends the JPanels. One JPanel for each operation.
    I use the     Main main = new Main();    method to access variables from the Main class
    I use multiple JLabels in each Panel
    I use an action listener that stores the values inputed in the text field
    There is a loop that adds 1 point and prints "correct" when the correct answer is entered. 
        If the answer is incorrect, the number of points do not change and prints "wrong"
    In each panel I print out the answer for each question in the terminal shell so I don't have to 
        calculate the answers to check that the code works. 


