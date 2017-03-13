package com.calculator;

import com.intellij.psi.impl.JavaFactoryProvider;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;

public class Calculator {

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonC = new JButton("C");
    JButton buttonPlMin = new JButton("+/-");
    JButton buttonX2 = new JButton("x2");
    JButton buttonDel = new JButton("del");

    JPanel windowsContent = new JPanel();
    JTextField displayField = new JTextField(20);
    JPanel pl = new JPanel();

    Calculator(){
        windowsContent = new JPanel();

        BorderLayout bl = new BorderLayout();
        windowsContent.setLayout(bl);

        displayField = new JTextField(20);

        windowsContent.add("North",displayField);

        pl = new JPanel();
        GridLayout gl = new GridLayout(5,3);
        pl.setLayout(gl);

        pl.add(buttonC);
        pl.add(buttonPlMin);
        pl.add(button1);
        pl.add(button2);
        pl.add(button3);
        pl.add(button4);
        pl.add(button5);
        pl.add(button6);
        pl.add(button7);
        pl.add(button8);
        pl.add(button9);
        pl.add(buttonPoint);
        pl.add(button0);
        pl.add(buttonX2);
        pl.add(buttonDel);


        windowsContent.add("Center",pl);

        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(5,1);

        p2.setLayout(gl2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);
        p2.add(buttonEqual);

        windowsContent.add("East",p2);

        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(windowsContent);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(220,300);

        CalculateEngine calculateEngine = new CalculateEngine(this);
        button0.addActionListener(calculateEngine);
        button1.addActionListener(calculateEngine);
        button2.addActionListener(calculateEngine);
        button3.addActionListener(calculateEngine);
        button4.addActionListener(calculateEngine);
        button5.addActionListener(calculateEngine);
        button6.addActionListener(calculateEngine);
        button7.addActionListener(calculateEngine);
        button8.addActionListener(calculateEngine);
        button9.addActionListener(calculateEngine);
        buttonPoint.addActionListener(calculateEngine);
        buttonPlus.addActionListener(calculateEngine);
        buttonMinus.addActionListener(calculateEngine);
        buttonDivide.addActionListener(calculateEngine);
        buttonMultiply.addActionListener(calculateEngine);
        buttonEqual.addActionListener(calculateEngine);
        buttonC.addActionListener(calculateEngine);
        buttonPlMin.addActionListener(calculateEngine);
        buttonX2.addActionListener(calculateEngine);
        buttonDel.addActionListener(calculateEngine);

    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
