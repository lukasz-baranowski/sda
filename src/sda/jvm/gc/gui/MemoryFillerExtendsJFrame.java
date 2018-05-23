package sda.jvm.gc.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MemoryFillerExtendsJFrame extends JFrame {

    private JTextField numObjects = new JTextField();
    private JButton addObjectsButton = new JButton("Add objects");
    private JLabel output = new JLabel();
    private JPanel panelMain = new JPanel();
    private List<String> objects = new ArrayList<>();

    public MemoryFillerExtendsJFrame() throws HeadlessException {
        super("Memory Filler");
        initializeFrame();
    }

    private void initializeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        setVisible(true);
        addComponents();
    }

    private void addComponents() {
        //setLayout(new GridLayout(3, 1));
        setSize(new Dimension(350, 150));
        setContentPane(panelMain);

        numObjects.setPreferredSize(new Dimension(250, 30));
        panelMain.add(numObjects);

        panelMain.add(addObjectsButton);
        addObjectsButton.setPreferredSize(new Dimension(250, 30));
        addObjectsButton.addActionListener(e -> {
            int num = 0;
            try {
                num = Integer.valueOf(numObjects.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Cannot parse int value...");
                return;
            }
            int begin = objects.size();
            int end = begin + num;
            for (int i = begin; i < end; i++) {
                objects.add(String.valueOf(i));
            }
            output.setText(String.valueOf(objects.size()));
            // numObjects.setText("");
        });

        output.setPreferredSize(new Dimension(250, 30));
        output.setText("0");
        output.setHorizontalAlignment(SwingConstants.CENTER);
        output.setVerticalAlignment(SwingConstants.CENTER);
        panelMain.add(output);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MemoryFillerExtendsJFrame());
    }

}
