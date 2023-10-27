
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
//    globally declaring the buttons 
    JButton deposit,withdrawl,fastcash,pinchange,ministatement,Balanceenquiry,exit;
    String pinnumber;
    
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
//        background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
//        for text 
        JLabel text = new JLabel("Please select your transation");
        text.setBounds(225,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
//        Buttons
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this); //indicates the button is clicked
        image.add(deposit);
        
        withdrawl = new JButton("Withdraw");
        withdrawl.setBounds(350,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
         
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        Balanceenquiry = new JButton("Balance enquiry");
        Balanceenquiry.setBounds(350,485,150,30);
        Balanceenquiry.addActionListener(this);
        image.add(Balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(350,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
//       main frame
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
           
    }    
    
    
//    class override here of events package
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Transaction();
        
    }    
    
}
