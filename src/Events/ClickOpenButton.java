package Events;

import Graphic.ButtonOpen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClickOpenButton implements ActionListener {

    private ButtonOpen button; 

    private static int clickNumber = 0;
    private static int noCorrect = 0;
    private static ButtonOpen first = null; 
    private static ButtonOpen second = null;  

    public ClickOpenButton(ButtonOpen button) { 
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (first != null && second != null) {
            first.setText("");
            second.setText("");
            first = null;
            second = null;
        }
        if(first!=null && first.equals(button)){
            return;
        }
        clickNumber++;       
        if (clickNumber % 2 == 1) {
            button.setText(button.getInfo());
            first = button;
        } else {
            second = button;
            button.setText(button.getInfo());
            if (first.getInfo().equals(second.getInfo())) {
                noCorrect++;
                first.setEnabled(false);
                second.setEnabled(false);
                first = null;
                second = null;
            }
        }
        if(noCorrect==8){
            JOptionPane.showMessageDialog(null,"You successfully solved game");
            return;
        }

    }

}
