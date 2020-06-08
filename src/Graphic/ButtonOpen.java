package Graphic;

import java.awt.Font;
import javax.swing.JButton;

public class ButtonOpen extends JButton {

    private String info;

    public ButtonOpen(String info) {
        this.info = info;
        this.setFont(new Font("Arial",Font.PLAIN,40));
        
    }
 

    public String getInfo() { 
        return info;
    }
    
    
}
