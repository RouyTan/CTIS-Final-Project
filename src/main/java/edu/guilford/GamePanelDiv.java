package edu.guilford;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GamePanelDiv extends JPanel{

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
        double firstnumber = main.intFirst;
        double secondnumber = main.intSecond;
        double answer = main.roundedDivisionAnswer;

    public GamePanelDiv() { 
        super();
        initPanel();

            //pointsLabel.setText("Total Points: " + totalPoints);
            mathProblemLabel.setText(firstnumber + " / " + secondnumber);
            //answerLabel.setText("Correct Answer: " + (String.format("%.2f", answer)));
            //yesNoLabel.setText("yesNoLabel: " + yesNoString);
            setBackground(Color.green);

            System.out.println("Answer for Division Problem: " + answer);



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

        operationsLabel = new JLabel("Division ");
        add(operationsLabel);
            operationsLabel.setFont(new Font("impact", Font.ITALIC,40));
        
        
        pointsLabel = new JLabel("Division Points: " + totalPoints);  
        add(pointsLabel);
            pointsLabel.setFont(new Font("serif", Font.PLAIN ,20));


        mathProblemLabel = new JLabel();  
        add(mathProblemLabel);
            mathProblemLabel.setFont(new Font("serif", Font.BOLD ,30));

        instructionsLabel = new JLabel("Enter answer: ");
        add(instructionsLabel);
            instructionsLabel.setFont(new Font("serif", Font.PLAIN ,15));
    

        

        //answerLabel = new JLabel("Correct Answer: ");  
        //add(answerLabel);


        answerField = new JTextField ("                      ");
        add(answerField);

        correctJLabel = new JLabel ();
        add (correctJLabel);

        //answerField.addActionListener(new EnterListener());
        answerField.addActionListener(new PointListener());
        //answerField.addActionListener(new yesNoListener());


        }
    
  
    private void updateIndex() {

        if ((userInputNumber == answer) && (totalPoints == 0)) {
            totalPoints = 1.0;
            correctJLabel.setText("correct");

        }
            //else if ((userInputNumber == answer) && (totalPoints >= 1)) {
            //totalPoints = totalPoints + 1.0;
        //}   
        else if (userInputNumber != answer) {  
            totalPoints = totalPoints + 0;
            correctJLabel.setText("wrong");

                
        }

        pointsLabel.setText("Division Points: " + totalPoints);
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
