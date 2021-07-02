package good.caculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener
{
    int calculation;
    double number, answer;

    
    public JFrame frame;
    public JTextField l;
    public JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1, back;
    public JRadioButton onRadioButton ,offRadioButton ;
    public ButtonGroup G1;
    public JPanel p;
    public JLabel label;
    public Calculator()
    {
        
        G1 = new ButtonGroup();
        onRadioButton = new JRadioButton("ON");
        offRadioButton = new JRadioButton("OFF");
        label = new JLabel();
        l = new JTextField();
        back = new JButton("<");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        // equals button
        beq1 = new JButton("=");
        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
        // create . button
        be = new JButton(".");
        frame = new JFrame();
        p = new JPanel();
        frame.setTitle("Calculator");
        frame.setSize(625,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(500, 80);
        

        p.setSize(710, 600);
        p.setLayout(null);
        //p.setBackground(Color.gray);

        label.setBounds(50, 0, 100, 50);
        label.setForeground(Color.red);
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        
        
        onRadioButton.setBounds(460, 10, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        onRadioButton.setForeground(Color.red);
        onRadioButton.addActionListener(this);
        
        
        
        offRadioButton.setBounds(520, 10, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 17));
        offRadioButton.setForeground(Color.red);
        offRadioButton.addActionListener(this);
        
        
        l.setBounds(30, 50, 550, 40);
        l.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
       
        
        back.setBounds(30, 120, 115, 45);
        back.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        back.setBackground(Color.gray);
        back.addActionListener(this);

        beq.setBounds(175, 120, 260, 45);
        beq.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        beq.setBackground(new Color(240,186,51));
        beq.addActionListener(this);

        ba.setBounds(465, 120, 115, 45);
        ba.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        ba.setBackground(Color.gray);
        ba.addActionListener(this);
        
        b1.setBounds(30, 185, 115, 45);
        b1.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b1.setBackground(new Color(39,149,149));
        b1.addActionListener(this);

        b2.setBounds(175, 185, 115, 45);
        b2.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b2.setBackground(new Color(39,149,149));
        b2.addActionListener(this);

        b3.setBounds(320, 185, 115, 45);
        b3.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b3.setBackground(new Color(39,149,149));
        b3.addActionListener(this);
        
        bs.setBounds(465, 185, 115, 45);
        bs.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        bs.setBackground(Color.gray);
        bs.addActionListener(this);

        b4.setBounds(30, 250, 115, 45);
        b4.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b4.setBackground(new Color(39,149,149));
        b4.addActionListener(this);

        b5.setBounds(175, 250, 115, 45);
        b5.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b5.setBackground(new Color(39,149,149));
        b5.addActionListener(this);

        b6.setBounds(320, 250, 115, 45);
        b6.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b6.setBackground(new Color(39,149,149));
        b6.addActionListener(this);

        bm.setBounds(465, 250, 115, 45);
        bm.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        bm.setBackground(Color.gray);
        bm.addActionListener(this);

        b7.setBounds(30, 315, 115, 45);
        b7.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b7.setBackground(new Color(39,149,149));
        b7.addActionListener(this);
       
        b8.setBounds(175, 315, 115, 45);
        b8.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b8.setBackground(new Color(39,149,149));
        b8.addActionListener(this);

        b9.setBounds(320, 315, 115, 45);
        b9.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b9.setBackground(new Color(39,149,149));
        b9.addActionListener(this);

        bd.setBounds(465, 315, 115, 45);
        bd.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        bd.setBackground(Color.gray);
        bd.addActionListener(this);

        be.setBounds(30, 380, 115, 45);
        be.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        be.setBackground(Color.gray);
        be.addActionListener(this);

        b0.setBounds(175, 380, 115, 45);
        b0.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        b0.setBackground(new Color(39,149,149));
        b0.addActionListener(this);

        beq1.setBounds(320, 380, 260, 45);
        beq1.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        beq1.setBackground(Color.gray);
        beq1.addActionListener(this);

        frame.add(p);
        G1.add(onRadioButton);
        G1.add(offRadioButton);
        p.add(onRadioButton);
        p.add(offRadioButton);
        p.add(label);
        p.add(l);
        p.add(back);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();
        } 
        else if (source == offRadioButton) {
            disable();
        }
        if (source == beq) {
            label.setText("");
            l.setText("");
        }
        else if (source == back) {
            int length = l.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(l.getText());
                back.deleteCharAt(number);
                l.setText(back.toString());

            }
            if (l.getText().endsWith("")) {
                label.setText("");
            }
        } 
        else if (source == b0) {
            if (l.getText().equals("0")) {
                return;
            } else {
                l.setText(l.getText() + "0");
            }
        } 
        else if (source == b1) {
            l.setText(l.getText() + "1");
        }
        else if (source == b2) {
            l.setText(l.getText() + "2");
        } 
        else if (source == b3) {
            l.setText(l.getText() + "3");
        } 
        else if (source == b4) {
            l.setText(l.getText() + "4");
        } 
        else if (source == b5) {
            l.setText(l.getText() + "5");
        }
        else if (source == b6) {
            l.setText(l.getText() + "6");
        }
        else if (source == b7) {
            l.setText(l.getText() + "7");
        }
        else if (source == b8) {
            l.setText(l.getText() + "8");
        }
        else if (source == b9) {
            l.setText(l.getText() + "9");
        }
        else if (source == be) {
            if (l.getText().contains(".")) {
                return;
            } 
            else {
                l.setText(l.getText() + ".");
            }


        }
        else if (source == ba) {
            String str = l.getText();
            number = Double.parseDouble(l.getText());
            l.setText("");
            label.setText(str + "+");
            calculation = 1;
        }
        else if (source == bs) {
            String str = l.getText();
            number = Double.parseDouble(l.getText());
            l.setText("");
            label.setText(str + "-");
            calculation = 2;
        }
        else if (source == bm) {
            String str = l.getText();
            number = Double.parseDouble(l.getText());
            l.setText("");
            label.setText(str + "*");
            calculation = 3;
        }
        else if (source == bd) {
            String str = l.getText();
            number = Double.parseDouble(l.getText());
            l.setText("");
            label.setText(str + "/");
            calculation = 4;

            
            
        }
        else if (source == beq1) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(l.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        l.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        l.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(l.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        l.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        l.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(l.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        l.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        l.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(l.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        l.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        l.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }


    }


    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        l.setEnabled(true);
        label.setEnabled(true);
        beq.setEnabled(true);
        back.setEnabled(true);
        bd.setEnabled(true);
        bs.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bm.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        ba.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        beq1.setEnabled(true);
        b0.setEnabled(true);
        be.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        l.setText("");
        l.setEnabled(false);
        label.setText(" ");
        beq.setEnabled(false);
        back.setEnabled(false);
        bd.setEnabled(false);
        bs.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bm.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        ba.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        beq1.setEnabled(false);
        b0.setEnabled(false);
        be.setEnabled(false);
    }
}
