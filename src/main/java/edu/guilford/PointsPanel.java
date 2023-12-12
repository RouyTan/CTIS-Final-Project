package edu.guilford;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PointsPanel extends JPanel{
    double totalPoints = 0;
    JLabel pointsLabel;

    public PointsPanel() { 
        super();
        initPanel();
        pointsLabel.setText("Total Points: " + totalPoints);

    }


    public  void initPanel() { 
        pointsLabel = new JLabel("Total Points: " + totalPoints);
  
        add(pointsLabel);
        


        //answerField.addActionListener(new EnterListener());
        //answerField.addActionListener(new PointListener());
        

    }



    


}
