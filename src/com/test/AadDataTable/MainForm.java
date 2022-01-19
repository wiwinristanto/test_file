package com.test.AadDataTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel rootPanel;
    private JButton sendButton;
    private JTable showTable;

    public MainForm(){
        System.out.println("OKE");
        createTable();
    }
    public JPanel getRootPanel(){
        return rootPanel;
    }

    private void createTable(){
        showTable.setModel(new DefaultTableModel(
                null,
                new String[]{"Title", "Year", "Rating", "Num Votes"}
        ));
    }

}
