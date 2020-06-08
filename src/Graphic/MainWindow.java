package Graphic;

import Events.ClickOpenButton;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private JPanel panel;

    public MainWindow() {
        this.setTitle("Memory Game");
        this.setSize(800, 600);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        initComponents();

    }

    private void initComponents() {
        buttonConfig();

        this.add(panel);
    }

    public void buttonConfig() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        int[] numbers = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        ButtonOpen[] buttons = new ButtonOpen[16];
        for (int i = 0; i < buttons.length; i++) {
            int position = 0;
            while (true) {
                position = (int) (Math.random() * 16);
                if (numbers[position] != 0) {
                    break;
                }
            }

            int numb = numbers[position];
            numbers[position] = 0;
            buttons[i] = new ButtonOpen(String.valueOf(numb));
            buttons[i].addActionListener(new ClickOpenButton(buttons[i]));
            panel.add(buttons[i]);
        }

    }

    public JPanel getPanel() {
        return panel;
    }

}
