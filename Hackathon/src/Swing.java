// Code by Kyle Cox -- replit
//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
class Swing extends JFrame {
  public Swing() {
    JPanel input = new JPanel();
    input.setLayout(new BoxLayout(input, BoxLayout.Y_AXIS));
    JLabel askField = new JLabel("What field are you on?: ");
    JTextField fText = new JTextField("");
    JButton endButton = new JButton("Finalize");

    input.add(askField);
    input.add(fText);
    input.add(endButton);

    endButton.addActionListener(e -> {

    });

    JPanel root = new JPanel();
    root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));
    root.add(input);

    this.getContentPane().add(root);
    this.setTitle("CropManager");
    this.setSize(200, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    }

  public static void main(String[] args) {
    new Swing();
  }
}
