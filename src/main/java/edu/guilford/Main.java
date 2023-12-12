package edu.guilford;
import java.util.Random;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        /* 
        //Use randomGenerator to create 2 numbers
        Random randGenerator = new Random(); 
        Double firstnumber = randGenerator.nextDouble(1) * 100;
        double secondnumber = randGenerator.nextDouble(1) * 100;

        //Limit number of decimals through String then convert into Double with parseDouble()
        double shortenedFirst = Double.parseDouble(String.format("%.2f", firstnumber)); 
        double shortenedSecond = Double.parseDouble(String.format("%.2f", secondnumber));
    

        //Calculate answer to the problem
        double additionAnswer = shortenedFirst + shortenedSecond;
        

        //PRINTS
        System.out.println("Welcome to Math Game");
        System.out.println("This is the problem: " + shortenedFirst + " + " + shortenedSecond);
        System.out.println("This is the answer: " + String.format("%.2f", additionAnswer));
        */


        //JFRAME and GAMEPANEL
        JFrame myFrame = new JFrame("Student testing");  
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JPanel primary = new JPanel();  
        myFrame.getContentPane().add(primary);


        //PointsPanel pointsPanel = new PointsPanel();
        //primary.add(pointsPanel);

        GamePanelAdd studentPanelAdd = new GamePanelAdd();  
        primary.add(studentPanelAdd);

        GamePanelSub studentPanelSub = new GamePanelSub();  
        primary.add(studentPanelSub);

        GamePanelMul studentPanelMul = new GamePanelMul();  
        primary.add(studentPanelMul);

        GamePanelDiv studentPanelDiv = new GamePanelDiv();  
        primary.add(studentPanelDiv);

/*

        GamePanel studentPanelMul = new GamePanelMul();  
        primary.add(studentPanelMul);
        GamePanel studentPanelDiv = new GamePanelDiv();  
        primary.add(studentPanelDiv);

        GamePanel layeredPane = new GamePanel();
        JLayeredPane secondary = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(mathProblemLabel);
        secondary.add(layeredPane);

 */


        myFrame.pack();  
        myFrame.setVisible(true);

    }

    
        //Use randomGenerator to create 2 numbers
        Random randGenerator = new Random(); 
        Double firstnumber = randGenerator.nextDouble(1) * 100;
        double secondnumber = randGenerator.nextDouble(1) * 100;

        //Limit number of decimals through String then convert into Double with parseDouble()
        double shortenedFirst = Double.parseDouble(String.format("%.2f", firstnumber)); 
        double shortenedSecond = Double.parseDouble(String.format("%.2f", secondnumber));

        double intFirst = Double.parseDouble(String.format("%.0f", firstnumber)); 
        double intSecond = Double.parseDouble(String.format("%.0f", secondnumber));


    

        //Calculate answer to the problem
        double additionAnswer = shortenedFirst + shortenedSecond;
            double roundedAdditionAnswer = Double.parseDouble(String.format("%.2f", additionAnswer));
        double subtractionAnswer = shortenedFirst - shortenedSecond;
            double roundedSubtractionAnswer = Double.parseDouble(String.format("%.2f", subtractionAnswer));
        double multiplicationAnswer = intFirst * intSecond;
            double roundedMultiplicationAnswer = Double.parseDouble(String.format("%.2f", multiplicationAnswer));
        double divisionAnswer = intFirst/intSecond;
            double roundedDivisionAnswer = Double.parseDouble(String.format("%.2f", divisionAnswer));


            //double shortenedFirst = Double.parseDouble(String.format("%.2f", firstnumber)); 





}