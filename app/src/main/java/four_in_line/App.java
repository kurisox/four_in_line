/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package four.in.line;

import four.in.line.GUI.GameGUI;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        GameGUI gameGUI = new GameGUI();
                    }
                }
        );
    }
}