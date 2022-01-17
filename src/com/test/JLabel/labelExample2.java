package com.test.JLabel;

import javax.swing.*;


public class labelExample2 {
    private JTextField tfDns;
    private JButton button1;
    private JPanel rootPanel;
    private JTextField tfIP;
    private static labelExample2 p = new labelExample2();

    public static void main(String []args){
        JFrame frame = new JFrame("Find IP");
        frame.setContentPane(p.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public labelExample2 () {
        button1.addActionListener(e -> {
            try {
                String host = tfDns.getText();
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                tfIP.setText(ip);

            } catch (Exception ex ) {
//                System.out.println(ex);
                JOptionPane.showMessageDialog("Alamat yang anda masukan Tidak ditemukan");
            }
        });
    }

}
