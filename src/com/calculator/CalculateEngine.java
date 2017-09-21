package com.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CalculateEngine implements ActionListener {
    Calculator parent;
    char selectedAction = ' '; // + - * /
    double currentResult = 0d;
    CalculateEngine(Calculator parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JButton clickedButton = (JButton)e.getSource();
//        String clickedButtonLabel1 = clickedButton.getText();
//        JOptionPane.showConfirmDialog(null,"Была нажата кнопка " + clickedButtonLabel1, "Внимание!!!",JOptionPane.PLAIN_MESSAGE);
        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();
        double displayValue = 0;
        if (!"".equals(dispFieldText)){
            displayValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();
        if(src == parent.buttonPlus){
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonDivide){
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonEqual){
            if(selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            }else if(selectedAction == '-'){
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            }else if(selectedAction == '/'){
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            }else if(selectedAction == '*'){
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        }else if(src == parent.buttonC){
                currentResult = displayValue;
                parent.displayField.setText("");
        }else if(src == parent.buttonPlMin){
            currentResult = -displayValue;
            parent.displayField.setText("" + currentResult);
        }else if(src == parent.buttonX2){
            currentResult = displayValue*displayValue;
            parent.displayField.setText("" + currentResult);
        }else if (src == parent.buttonDel) {
            parent.displayField.setText(dispFieldText.substring(0,dispFieldText.length()-1));
        }else{
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(dispFieldText + clickedButtonLabel);
        }
    }
}
