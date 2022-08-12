package four.in.line.GUI;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame {
    private final int WIDTH = 1080;
    private final int HEIGHT = 720;
    private final String gameTitle = "Four in Line";

    private JPanel panel;
    private GameBoard gameBoard;

    public GameGUI(){
        this.setTitle(this.gameTitle);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(this.WIDTH, this.HEIGHT));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        initPanel();
        this.add(this.panel);
    }

    private void initPanel(){
        this.gameBoard = new GameBoard();
        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        this.panel.setLayout(new BorderLayout());
        this.panel.add(this.gameBoard,BorderLayout.CENTER);
    }
}
