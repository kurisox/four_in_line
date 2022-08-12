package four_in_line.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coin extends JButton implements ActionListener{
    private Point point;
    private boolean used;

    public Coin(Point point){
        this.point = point;
        this.setText(this.point.x + "/" + this.point.y);
        this.used = false;
        this.addActionListener(this);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!used){
            this.setBackground(Color.green);
            this.used = true;
        }
    }
}
