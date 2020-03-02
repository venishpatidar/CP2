import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class test {
  public static void main(String[] args) {
    JFrame base = new JFrame();
    base.setSize(400,800);
    base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton Push = new JButton("Push");
    JTextField val = new JTextField();
    JButton pop = new JButton("POP");
    JTextArea PrintStack = new JTextArea();
    Stack stack = new Stack();

    pop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        base.setVisible(false);
        stack.pop();
        base.setVisible(true);
      }
    });
    push.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        base.setVisible(false);
        stack.oush();
        base.setVisible(true);
      }
    });


    base.getContentPane().add(BorderLayout.NORTH ,val);
    base.getContentPane().add(BorderLayout.EAST,pop);
    base.getContentPane().add(BorderLayout.WEST,Push);
    base.getContentPane().add(BorderLayout.CENTER,PrintStack);
    base.setVisible(true);
  }
}