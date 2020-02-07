
package atmdynamickeypad;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.color.*;


public class SwapingNumber extends JFrame implements ActionListener {

   
    
    public JFrame panel1;
    JPasswordField passArea;
    JTextField errorMsg;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bEnter,bCancel,bClear;
    List<Integer> dataList1 = new ArrayList<>();
    //List<Integer> dataList2 = new ArrayList<Integer>();
    //List<Integer> dataList3 = new ArrayList<Integer>(); 
    Color dclr = new Color(255,21,21);
    int pin=1234;
    public SwapingNumber(){
        panel1=new JFrame("keypad for ATM");
        panel1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        passArea = new JPasswordField();
        passArea.setEnabled(true);
        passArea.setHorizontalAlignment(JPasswordField.CENTER);
        errorMsg=new JTextField();
        errorMsg.setEnabled(true);
        errorMsg.setHorizontalAlignment(JTextField.CENTER);
        b0=new JButton();
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        bEnter=new JButton();
        bCancel=new JButton();
        bClear=new JButton();
        
        
    }
    public void launchFrame(){
        panel1.setLayout(null);
        
        panel1.setVisible(true);
        panel1.setSize(800,800);
       
        try{
        
          for (int i = 0; i <10; i++) {
      dataList1.add(i);
    }
    Collections.shuffle(dataList1);    
   }
        catch(Exception e){
            System.out.println(e);
        }        
        String outp1=Integer.toString(dataList1.get(0));
        String outp2=Integer.toString(dataList1.get(1));
        String outp3=Integer.toString(dataList1.get(2));
        String outp4=Integer.toString(dataList1.get(3));
        String outp5=Integer.toString(dataList1.get(4));
        String outp6=Integer.toString(dataList1.get(5));
        String outp7=Integer.toString(dataList1.get(6));
        String outp8=Integer.toString(dataList1.get(7));
        String outp9=Integer.toString(dataList1.get(8));
        String outp10=Integer.toString(dataList1.get(9));
        
        panel1.add(passArea);
        passArea.setSize(400, 35);
        passArea.setLocation(200, 150);
                
        panel1.add(b0);
        b0.setSize(70, 50);
        b0.setLocation(200, 250);
        b0.setBackground(Color.YELLOW);
        b0.setLabel(outp1);
        b0.addActionListener(this);
        
        panel1.add(b1);
        b1.setSize(70, 50);
        b1.setLocation(300, 250);
        b1.setBackground(dclr);
        b1.setLabel(outp2);
        b1.addActionListener(this);
        
        panel1.add(b2);
        b2.setSize(70, 50);
        b2.setLocation(400, 250);
        b2.setBackground(Color.GREEN);
        b2.setLabel(outp3);
        b2.addActionListener(this);
        
        panel1.add(bCancel);
        bCancel.setSize(100, 50);
        bCancel.setLocation(500, 250);
        bCancel.setLabel("SWAP");
        bCancel.addActionListener(this);
        
        panel1.add(b3);
        b3.setSize(70, 50);
        b3.setLocation(200, 330);
        b3.setBackground(Color.CYAN);
        b3.setLabel(outp4);
        b3.addActionListener(this);
        
        panel1.add(b4);
        b4.setSize(70, 50);
        b4.setLocation(300, 330);
        b4.setBackground(Color.MAGENTA);
        b4.setLabel(outp5);
        b4.addActionListener(this);
        
        panel1.add(b5);
        b5.setSize(70, 50);
        b5.setLocation(400, 330);
        b5.setBackground(Color.ORANGE);
        b5.setLabel(outp6);
        b5.addActionListener(this);
        
        panel1.add(bClear);
        bClear.setSize(100, 50);
        bClear.setLocation(500, 330);
        bClear.setLabel("SELECT");
        bClear.addActionListener(this);
 
        panel1.add(b6);
        b6.setSize(70, 50);
        b6.setLocation(200, 410);
        b6.setBackground(Color.PINK);
        b6.setLabel(outp7);
        b6.addActionListener(this);
        
        panel1.add(b7);
        b7.setSize(70, 50);
        b7.setLocation(300, 410);
        b7.setBackground(Color.GRAY);
        b7.setLabel(outp8);
        b7.addActionListener(this);
        
        panel1.add(b8);
        b8.setSize(70, 50);
        b8.setLocation(400, 410);
        b8.setBackground(Color.WHITE);
        b8.setLabel(outp9);
        b8.addActionListener(this);
        
        panel1.add(bEnter);
        bEnter.setSize(100, 50);
        bEnter.setLocation(500, 410);
        bEnter.setLabel("ENTER");
        bEnter.addActionListener(this);
        
        panel1.add(b9);
        b9.setSize(70, 50);
        b9.setLocation(300, 490);
        b9.setBackground(Color.PINK);
        b9.setLabel(outp10);
        b9.addActionListener(this);
       
        panel1.add(errorMsg);
        errorMsg.setSize(360, 50);
        errorMsg.setLocation(220, 600);
        errorMsg.hide();
        
    }
    
    public void addDigitToDisplay(ActionEvent e){
        String charSizeInDisplay;
        charSizeInDisplay=passArea.getText();
        JButton a;
        a= (JButton) e.getSource();
        
        
        if(a.getText() == "SWAP"){
            //System.out.println("SWAP");
            swapDigit();       
        }
        else if(a.getText() == "SELECT"){
            //System.out.println("SELECT");
           /* if(charSizeInDisplay.length()==4){
                panel1.dispose();
            }*/
            if(dclr==b0.getBackground())
            {
               
                passArea.setText(passArea.getText()+b0.getText());
            }
            else if(dclr==b1.getBackground())
            {
               
                passArea.setText(passArea.getText()+b1.getText());
            }
            else if(dclr==b2.getBackground())
            {
               
                passArea.setText(passArea.getText()+b2.getText());
            }
            else if(dclr==b3.getBackground())
            {
               
                passArea.setText(passArea.getText()+b3.getText());
            }
            else if(dclr==b4.getBackground())
            {
               
                passArea.setText(passArea.getText()+b4.getText());
            }
                System.out.println(passArea.getText());
                //panel1.dispose();
            
        }
        else if(a.getText() == "ENTER"){
            if(charSizeInDisplay.length()==4)
            {
                if(pin==Integer.parseInt(passArea.getText())){
                errorMsg.setText("PIN Matched");
                //panel1.dispose();
                }
                else
                  errorMsg.setText("PIN Not Matched");  
            }
            else{
                errorMsg.setText("Sorry! Please enter the 4 letter password fully!");
                
                errorMsg.show();
            }
        }
        else{
        passArea.setText(passArea.getText()+a.getText());
        charSizeInDisplay=passArea.getText();
        if(charSizeInDisplay.length()>4){
            passArea.setText(passArea.getText().substring(0, 4));
        }
        }
        
        //passArea.setText;
    }
    public void swapDigit()
    {
       List<Integer> dataList1 = new ArrayList<>();
      for (int i = 0; i <10; i++) 
      {
      dataList1.add(i);  
      }
      Collections.shuffle(dataList1);
        String outp1=Integer.toString(dataList1.get(0));
        String outp2=Integer.toString(dataList1.get(1));
        String outp3=Integer.toString(dataList1.get(2));
        String outp4=Integer.toString(dataList1.get(3));
        String outp5=Integer.toString(dataList1.get(4));
        String outp6=Integer.toString(dataList1.get(5));
        String outp7=Integer.toString(dataList1.get(6));
        String outp8=Integer.toString(dataList1.get(7));
        String outp9=Integer.toString(dataList1.get(8));
        String outp10=Integer.toString(dataList1.get(9));
        
        b0.setLabel(outp1);
        b0.setLabel(outp1);
        b1.setLabel(outp2);
        b2.setLabel(outp3);
        b3.setLabel(outp4);
        b4.setLabel(outp5);
        b5.setLabel(outp6);
        b6.setLabel(outp7);
        b7.setLabel(outp8);
        b8.setLabel(outp9);
        b9.setLabel(outp10);
        //swapDigit();
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        SwapingNumber atm=new SwapingNumber();
        atm.launchFrame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
      addDigitToDisplay(e);  
      
    }   
}