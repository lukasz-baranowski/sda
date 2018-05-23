package sda.jvm.gc.gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MemoryFiller {
    private JTextField numObjects;
    private JButton addObjectsButton;
    private JLabel output;
    private JPanel panelMain;
    private static List<String> objects;

    public MemoryFiller() {
        output.setText("0");

        addObjectsButton.addActionListener(e -> {
            int num = 0;
            try {
                num = Integer.valueOf(numObjects.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Cannot parse int value...");
                return;
            }
            int begin = objects.size();
            int end =  begin + num;
            for (int i = begin; i < end; i++) {
                objects.add(String.valueOf(i));
            }
            output.setText(String.valueOf(objects.size()));
            numObjects.setText("");
        });
    }

    public static void main(String[] args) {
        objects = new ArrayList<>();
        JFrame frame = new JFrame("MemoryFiller");
        frame.setContentPane(new MemoryFiller().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
