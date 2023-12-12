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

public class GamePanelSub extends JPanel{

    double totalPoints = 0;
    double userInputNumber;
    private JTextField answerField;
    private JLabel mathProblemLabel;
    private JLabel pointsLabel;
    private JLabel answerLabel;
    private JLabel operationsLabel;
    private JLabel instructionsLabel;
    private JLabel correctJLabel;
    static Scanner sc = new Scanner(System.in);



    Main main = new Main();
        double firstnumber = main.shortenedFirst;
        double secondnumber = main.shortenedSecond;
        double subtractionAnswer = main.roundedSubtractionAnswer;

    public GamePanelSub() { 
        super();
        initPanel();

            mathProblemLabel.setText(firstnumber + " - " + secondnumber);
            //answerLabel.setText("Correct Answer: " + subtractionAnswer);
            setBackground(Color.blue);

            System.out.println("Answer for Subtraction Problem: " + subtractionAnswer);


    }

    private class PointListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            userInputNumber = Double.parseDouble(answerField.getText());
            updateIndex();
        }
    }

    /* 
    private class yesNoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            userInputNumber = Double.parseDouble(answerField.getText());
            updateIndex();
        }
    }
    */
        
    public void initPanel() { 
        
        setPreferredSize(new Dimension(200, 200));  
        
        operationsLabel = new JLabel("Subtraction ");
        add(operationsLabel);
            operationsLabel.setFont(new Font("impact", Font.ITALIC,40));
        
        pointsLabel = new JLabel("Subtraction Points: " + totalPoints);  
        add(pointsLabel);
            pointsLabel.setFont(new Font("serif", Font.PLAIN ,20));


        mathProblemLabel = new JLabel();  
        add(mathProblemLabel);
            mathProblemLabel.setFont(new Font("serif", Font.BOLD ,30));
        
        instructionsLabel = new JLabel("Enter answer: ");
            add(instructionsLabel);
                instructionsLabel.setFont(new Font("serif", Font.PLAIN ,15));
    
        /* 
        userAnswerLabel = new JLabel("Entered Answer: ");  
        add(userAnswerLabel);
        */
        
        /* 
        answerLabel = new JLabel("Correct Answer: ");  
        add(answerLabel);
        */


        answerField = new JTextField ("                      ");
        add(answerField);

        correctJLabel = new JLabel ();
        add (correctJLabel);

        //answerField.addActionListener(new EnterListener());
        answerField.addActionListener(new PointListener());
        //answerField.addActionListener(new yesNoListener());


        }
    
  
    private void updateIndex() {

        if ((userInputNumber == subtractionAnswer) && (totalPoints == 0)) {
            totalPoints = 1.0;
            correctJLabel.setText("correct");

        }
            else if ((userInputNumber == subtractionAnswer) && (totalPoints >= 1)) {
            totalPoints = totalPoints + 1.0;
        }   else if (userInputNumber != subtractionAnswer) {  
            totalPoints = totalPoints + 0;
            correctJLabel.setText("wrong");

                
        }

        pointsLabel.setText("Total Points: " + totalPoints);
        //answerField.addActionListener((ActionListener) this);
        //userAnswerLabel.setText("Entered Answer: " + userInputNumber);


        /*if (userInputNumber == additionAnswer) {
            yesNoString = "yes";
        }   else if (userInputNumber != additionAnswer) {  
            yesNoString = "no";
        }
                
        }
        */

    }
}
