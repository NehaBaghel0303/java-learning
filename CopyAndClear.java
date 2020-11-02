import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CopyAndClear {
   public static void main(String arg[]) {
      JFrame frame = new JFrame("Copy And Clear");
      frame.setSize(500, 500);
      // Setting layout as null
      frame.setLayout(null);

      // Create first text field
      JTextField text1 = new JTextField("Devendra");  
      // x, y, width, height
      text1.setBounds(50, 30, 150, 30);
      // add first text field to frame
      frame.add(text1);
      // create 2nd text field
      JTextField text2 = new JTextField();
      text2.setBounds(230,30,150,30);
      frame.add(text2);
      JButton btn1 = new JButton("copy");
      btn1.setBounds(50,90,100,30);
      frame.add(btn1);

      JButton btn2 = new JButton("clear");
      btn2.setBounds(230,90,100,30);
      frame.add(btn2);

      // to perform action, we need to add action listener to button 1
      // and pass an object of ActionListener
      btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          String text1_value;
          text1_value = text1.getText();
          text2.setText(text1_value);
        }
      });

      //add action for clear button
      btn2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          text1.setText(" ");
          text2.setText(" ");
        }
      });

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      // To show the frame otherwise it will not be visible to us
      frame.setVisible(true);
   }
}