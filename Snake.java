package game;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Snake extends JFrame {
  Snake() {
    addWindowListener(new MyWindowAdapter());
    Board b = new Board();
    add(b);
    pack();

    setLocationRelativeTo(null);
    setTitle("Snake Game");
    setResizable(false);

  }
  public static void main(String args[]) {
    new Snake().setVisible(true);
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}