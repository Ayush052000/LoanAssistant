import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.lang.*;
public class LoanAssistant extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,myTextField;
    JTextArea t5;
    JButton b1,b2,b3,b4,b5;
    GridBagConstraints gridConstraints;
    boolean c;
    Color lightYellow = new Color(255,255,128);
    LoanAssistant(){
        setTitle("Loan Assistant");
        setVisible(true);
        setSize(800,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        getContentPane().setLayout(new GridBagLayout());
        Font myFont = new Font("Arial", Font.PLAIN, 16);
        l1.setText("Loan Balance");
        l1.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(l1, gridConstraints);
        
        t1.setPreferredSize(new Dimension(100,25));
        t1.setHorizontalAlignment(SwingConstants.LEFT);
        t1.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(t1, gridConstraints);
        
        l2.setText("Interest Rate");
        l2.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(l2, gridConstraints);
        
        t2.setPreferredSize(new Dimension(100,25));
        t2.setHorizontalAlignment(SwingConstants.LEFT);
        t2.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(t2, gridConstraints);
        
        l3.setText("No. of Payments");
        l3.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(l3, gridConstraints);
        
        t3.setPreferredSize(new Dimension(100,25));
        t3.setHorizontalAlignment(SwingConstants.LEFT);
        t3.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(t3, gridConstraints);
        
        l4.setText("Monthly Payment");
        l4.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(l4, gridConstraints);
        
        t4.setPreferredSize(new Dimension(100,25));
        t4.setHorizontalAlignment(SwingConstants.LEFT);
        t4.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        gridConstraints.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(t4, gridConstraints);
        
        b1 = new JButton();
        b2 = new JButton();
        b1.setText("Compute Monthly Payment");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(b1, gridConstraints);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
           {
               b1ActionPerformed(e);
           }
        });
        
        b2.setText("New Loan Analysis");
        b2.setEnabled(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10, 0, 10, 0);
        getContentPane().add(b2, gridConstraints);
        b2.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               b2ActionPerformed(e);
           }
        });
        
        b3 = new JButton();
        b4 = new JButton();
        b3.setText("X");
        b3.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(b3, gridConstraints);
        b3.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               b3ActionPerformed(e);
           }
        });

        b4.setText("X");
        b4.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.insets = new Insets(10, 0, 0, 0);
        getContentPane().add(b4, gridConstraints);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b4ActionPerformed(e);
            }
        });

        l5 = new JLabel();
        t5 = new JTextArea();
        b5 = new JButton();
        
        l5.setText("Loan Analysis:");
        l5.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(0, 10, 0, 0);
        getContentPane().add(l5, gridConstraints);
        
        t5.setPreferredSize(new Dimension(250, 150));
        t5.setFocusable(false);
        t5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t5.setFont(new Font("Courier New", Font.PLAIN, 14));
        t5.setEditable(false);
        t5.setBackground(Color.WHITE);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight = 4;
        gridConstraints.insets = new Insets(0, 10, 0, 10);
        getContentPane().add(t5, gridConstraints);
        
        b5.setText("Exit");
        b5.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 5;
        getContentPane().add(b5, gridConstraints);
        b5.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               b5ActionPerformed(e);
           }
        });
        b4.doClick();
    }
    private void b1ActionPerformed(ActionEvent e)
        {
            double balance, interest, payment;
            int months;
            double monthlyInterest, multiplier;
            double loanBalance, finalPayment;
            if (validateDecimalNumber(t1)){
            balance = Double.valueOf(t1.getText()).doubleValue();
            }
            else{
                JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.",
                "Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (validateDecimalNumber(t2))
            interest = Double.valueOf(t2.getText()).doubleValue();
            else{
                JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.",
                "Interest Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            monthlyInterest = interest / 1200;
            if(c){
                 if (validateDecimalNumber(t3))
                 months = Integer.valueOf(t3.getText()).intValue();
                 else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty No of payment entry.\nPlease correct.",
                "No of Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
                }
                 if(interest == 0){
                     payment = balance/months;
                    }
                 else{   
                 multiplier = Math.pow(1 + monthlyInterest, months);
                 payment = balance * monthlyInterest * multiplier / (multiplier - 1);
                 }
                 t4.setText(new DecimalFormat("0.00").format(payment));
            }
            else{
                if (validateDecimalNumber(t4)){
                payment = Double.valueOf(t4.getText()).doubleValue();
                if (payment <= (balance * monthlyInterest + 1.0)){
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be Rs" +
                    new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) +  "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                        t4.setText(new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)));
                        payment = Double.valueOf(t4.getText()).doubleValue();
                    }
                    else{
                        t4.requestFocus();
                        return;
                    }
                }
                }
                else{
                    JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Pay.\nPlease correct.",
                    "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(interest == 0){
                    months = (int)(balance/payment);
                }else{
                months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))/ Math.log(1 + monthlyInterest));
                }
                t3.setText(String.valueOf(months));
            }
            payment = Double.valueOf(t4.getText()).doubleValue();
            t5.setText("Loan Balance: " + new DecimalFormat("0.00").format(balance) + "/-");
            t5.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
            loanBalance = balance;
            for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
            {
                loanBalance += loanBalance * monthlyInterest - payment;
            }
            finalPayment = loanBalance;
            if (finalPayment > payment){
                loanBalance += loanBalance * monthlyInterest - payment;
                finalPayment = loanBalance;
                months++;
                t3.setText(String.valueOf(months));
            }
            t5.append("\n\n" + String.valueOf(months - 1) + " Payments of " + new DecimalFormat("0.00").format(payment) + "/-");
            t5.append("\n" + "Final Payment of: " + new DecimalFormat("0.00").format(finalPayment) + "/-");
            t5.append("\n" + "Total Payments: " + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment) + "/-");
            t5.append("\n" + "Interest Paid " + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance) + "/-");
            b1.setEnabled(false);
            b2.setEnabled(true);
            b2.requestFocus();
        }
    private void b2ActionPerformed(ActionEvent e)
        {
            if (c)
            {
                t4.setText("");
            }
            else{
                t3.setText("");
            }
            t5.setText("");
            b1.setEnabled(true);
            b2.setEnabled(false);
            t1.requestFocus();
        } 
    private void b3ActionPerformed(ActionEvent e)
        {
            c = false;
            b4.setVisible(true);
            b3.setVisible(false);
            t3.setEditable(false);
            t3.setBackground(lightYellow);
            t3.setFocusable(false);
            t3.setText("");
            t4.setEditable(true);
            t4.setBackground(Color.WHITE);
            t4.setFocusable(true);
            b1.setText("Compute No. of Payment");
            t1.requestFocus();
        }
    private void b4ActionPerformed(ActionEvent e)
        {
            c = true;
            b4.setVisible(false);
            b3.setVisible(true);
            t3.setEditable(true);
            t3.setBackground(Color.WHITE);
            t3.setFocusable(true);
            t4.setText("");
            t4.setEditable(false);
            t4.setBackground(lightYellow);
            t4.setFocusable(false);
            b1.setText("Compute Monthly Payment");
            t1.requestFocus();
        }  
    private void b5ActionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    public boolean validateDecimalNumber(JTextField tf){
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0){
            valid = false;
        }else{
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (c >= '0' && c <= '9'){
                    continue;
                }
                if (c == '.' && !hasDecimal){
                    hasDecimal = true;
                }else{
                    valid = false;
                }
            }
        }
        tf.setText(s);
        if (!valid){
            tf.requestFocus();
        }
        return (valid);
    }
    public static void main(String args[]){
        new LoanAssistant();
    }
}