package com.calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
//    JFrame myFrame = new JFrame("Приложение калькулятор");
//    JButton myButton = new JButton();
//
//    JPanel myPanel = new JPanel();
public static void main(String[] args) {
    //Создаем панель
    JPanel windowContent = new JPanel();

    //Задаем менеджер понели
    FlowLayout fl = new FlowLayout();
    windowContent.setLayout(fl);

    //Создаем компаненты в памяти
    JLabel label1 = new JLabel("Цифру 1 ");
    JTextField field1 = new JTextField(10);
    JLabel label2 = new JLabel("Цифру 2 ");
    JTextField field2 = new JTextField(10);
    JLabel label3 = new JLabel("Сумма ");
    JTextField result = new JTextField(10);
    JButton go = new JButton("Добавить ");

    //Добавили компоненты на панель
    windowContent.add(label1);
    windowContent.add(field1);
    windowContent.add(label2);
    windowContent.add(field2);
    windowContent.add(label3);
    windowContent.add(result);
    windowContent.add(go);

    //Задаем фрейм и задаем для фрейма нашу панель
    JFrame frame = new JFrame("Мой калькулятор на Андроид");
    frame.setContentPane(windowContent);

    //Задаем размеры и делаем его видимым
    frame.setSize(200,100);
    frame.setVisible(true);
}


}
