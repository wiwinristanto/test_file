package com.test.AddDataTab;

import com.test.AadDataTable.MainForm;
import com.test.AddDataTab.ui.MainUI;

import javax.swing.*;

public class Main {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("HAlo");
                createGUI();
            }
        });
    }

    private static void createGUI(){
        MainForm ui = new MainForm();
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
