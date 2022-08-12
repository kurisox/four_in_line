package four_in_line.GUI;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private final int ROWS = 6;
    private final int COLUMNS = 7;
    public GameBoard(){
        this.setLayout(new GridLayout(this.ROWS, this.COLUMNS));
        createCoins();
    }

    public void createCoins(){
        for (int i = 1; i <= 6; i++ ){
            for (int k = 1; k <= 7; k++){
                this.add(new Coin(new Point(i,k)));
            }
        }
    }
}
