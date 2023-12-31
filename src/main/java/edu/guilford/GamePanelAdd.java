//Author: Rou Yu Tan

package edu.guilford;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GamePanelAdd extends JPanel{

    double totalPoints = 0;
    double userInputNumber;
    private JTextField answerField;
    private JLabel operationsLabel;
    private JLabel mathProblemLabel;
    private JLabel pointsLabel;
    private JLabel answerLabel;
    private JLabel instructionsLabel;
    private JLabel correctJLabel;
    static Scanner sc = new Scanner(System.in);


    //Access variables in the Main class
    Main main = new Main();
        double firstnumber = main.shortenedFirst;
        double secondnumber = main.shortenedSecond;
        double additionAnswer = main.roundedAdditionAnswer;



    public GamePanelAdd() { 
        super();
        initPanel();

            mathProblemLabel.setText(firstnumber + " + " + secondnumber); //Shows math problem
            //answerLabel.setText("Correct Answer: " + additionAnswer);
            setBackground(Color.red);

            System.out.println("Answer for Addition Problem: " + additionAnswer); //Prints answer to math problem in the terminal shell

    }
    
    //Store data entered by the user
    private class PointListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            userInputNumber = Double.parseDouble(answerField.getText());
            updateIndex();
        }
    }


        
    public void initPanel() { 
        
        setPreferredSize(new Dimension(200, 200));  

        operationsLabel = new JLabel("Addition ");
        add(operationsLabel);
            operationsLabel.setFont(new Font("impact", Font.ITALIC,40));


        //Shows totalPoints
        pointsLabel = new JLabel("Addition Points: " + totalPoints);  
        add(pointsLabel);
            pointsLabel.setFont(new Font("serif", Font.PLAIN ,20));


        mathProblemLabel = new JLabel();  
        add(mathProblemLabel);
            mathProblemLabel.setFont(new Font("serif", Font.BOLD ,30));

        instructionsLabel = new JLabel("Enter answer: ");
        add(instructionsLabel);
            instructionsLabel.setFont(new Font("serif", Font.PLAIN ,15));

        /* 
        answerLabel = new JLabel("Correct Answer: ");  
        add(answerLabel);
        */


        //JTextField
        answerField = new JTextField ("                      ");
        add(answerField);

        //Prints "correct" and "wrong"
        correctJLabel = new JLabel ();
        add (correctJLabel);

        //answerField.addActionListener(new EnterListener());
        answerField.addActionListener(new PointListener());
        //answerField.addActionListener(new yesNoListener());

        }
    
  

    private void updateIndex() {

        //If user is correct, they earn a point and the correctJLabel prints "correct"
        if ((userInputNumber == additionAnswer) && (totalPoints == 0)) {
            totalPoints = 1.0;
            correctJLabel.setText("correct");

        }   //Included so total points would increase correctly
            else if ((userInputNumber == additionAnswer) && (totalPoints >= 1)) {
            totalPoints = totalPoints + 1.0;

            //If user is incorrect, they do not earn a point and the correctJLabel prints "wrong"
        }   else if (userInputNumber != additionAnswer) {  
            totalPoints = totalPoints + 0;
            correctJLabel.setText("wrong");

        }


        pointsLabel.setText("Addition Points: " + totalPoints); //updates the totalPoints
        //answerField.addActionListener((ActionListener) this);
        //userAnswerLabel.setText("Entered Answer: " + userInputNumber);


    }
}
