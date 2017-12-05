package com.stp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;


public class RegForm extends  JFrame implements ActionListener,ItemListener
{
    
    
    private Integer[] date={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    private String[] month={"01","02","03","04","05","06","07","08","09","10","11","12"};
    private Integer[] year={1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,};
    JLabel jl,jl2,jl3,jl4,jl5,jl6,j18,j19,j2,j3,j4,j5;
    JTextField jt1, jt2;
    JPasswordField jp,jp1;
    JRadioButton jr,jr1;
    
    
    JComboBox  jcb,jcb1,jcb2,jcb3,jcb4;
    JButton jb1,jb2;
    Font f,f1;
   
    JTextArea jta,jta1;
    ButtonGroup bg1;
    
    
    
   
   public RegForm()
    {
        
        
         f=new Font("Lucida Handwriting", 25, 25);
         f1=new Font("Arial black", 10,10);
       setLayout(null);
        jl=new JLabel("Registration Form");
        
        jl.setFont(f);
        jl.setForeground(Color.green);
        jl2=new JLabel("USER ID:");
        jl2.setForeground(Color.black);
        
        jl3=new JLabel("PASSWORD:");
        jl3.setForeground(Color.black);
        
        j18=new JLabel("RE-PASSWORD:");
        j18.setForeground(Color.black);
        
        jl4=new JLabel("MOBILE NO:");
        jl4.setForeground(Color.black);
        
        jl5=new JLabel("GENDER:");
        jl5.setForeground(Color.black);
        
        jl6=new JLabel("COUNTRY:");
        jl6.setForeground(Color.black);
        j3=new JLabel("CITY:");
        j3.setForeground(Color.black);
        j19=new JLabel("ADDRESS:");
        j19.setForeground(Color.black);
        j2=new JLabel("DOB:");
        j2.setForeground(Color.black);
        j4=new JLabel("[OPTIONAL:Only For India]");
        j4.setForeground(Color.black);
        jt1=new JTextField("@mail.com");
        jt1.setBackground(Color.white);
        
        jt2=new JTextField("+91",2);
        jp=new JPasswordField();
        
        jp1=new JPasswordField();
        jr=new JRadioButton("MALE");
        jr1=new JRadioButton("FEMALE");
       
        
        java.util.Vector<String> v=new java.util.Vector<String>();
        
        v.add("INDIA");
        v.add("USA");
        v.add("UK");
        v.add("UAE");
        v.add("ENGLAND");
        v.add("CHINA");
        v.add("AUSTRILA");
        v.add("LONDON");
        v.add("RUSSIA");
        jcb=new JComboBox(v);
        java.util.Vector<String> v1=new java.util.Vector<String>();
        
        v1.add("ANDHRA PRADESH");
        v1.add("HYDERABAD");
        v1.add("CHENNAI");
        v1.add("BANGLORE");
        v1.add("KOLKATA");
        v1.add("NEW DELHI");
        v1.add("MUMBAI");
        v1.add("PUNE");
        v1.add("KOCHI");
        v1.add("INDORE");
        v1.add("NAGPUR");
        v1.add("VADODARA");
        jcb4=new JComboBox(v1);
        
        jcb1=new JComboBox(date);
       
        jcb2=new JComboBox(month);
       
        jcb3=new JComboBox(year);
        
        
       jb1=new JButton("SUBMIT");
       jb2=new JButton("CLEAR");
       jta=new JTextArea();
       jta.setFont(f1);
       jta1=new JTextArea("address for communication ");
       
       jb1.setForeground(Color.blue);
        jta.setForeground(Color.blue);
        jta1.setForeground(Color.black);
       jb2.setForeground(Color.blue);
      
        
      bg1=new ButtonGroup();
      {
          ButtonGroup bg1 = new ButtonGroup( );

bg1.add(jr);
bg1.add(jr1);

      }
         
        
         // arraging
         
         jl.setBounds(270, 35, 280, 40);
         jl2.setBounds(35, 95, 120, 40);
         jl3.setBounds(35, 145, 120, 40);
         j18.setBounds(30, 195, 150,40);
         jl4.setBounds(35, 245, 120, 40);
         jl5.setBounds(35, 375, 120, 40);
         jl6.setBounds(355, 110, 120, 40);
         j19.setBounds(400, 300, 120, 40);
         j2.setBounds(35,320,120,40);
         j3.setBounds(363,230,120,40);
         j4.setBounds(365,190,150,40);
         jt1.setBounds(125, 100, 120, 30);
         jp.setBounds(125, 150, 120, 30);
         jp1.setBounds(125, 200, 120, 30);
         jt2.setBounds(125, 250, 120, 30);
         jr.setBounds(130, 380, 80, 30);
         jr1.setBounds(220, 380, 80, 30);
         jcb.setBounds(450, 120,100, 30); 
         jcb1.setBounds(100,320,50,30);
         jcb2.setBounds(180,320,50,30);
         jcb3.setBounds(250,320,60,30);
         jcb4.setBounds(450, 230,142, 30);
         jb1.setBounds(420, 490, 120, 40);
         jb2.setBounds(200, 490, 120, 40);
         jta.setBounds(590, 120, 160, 30);
         jta1.setBounds(480, 300, 180, 100);
         
         
       // jl7.setBounds(0, 0, 800, 600);
          
         
         
         add(jl);// adding to Container
         add(jl2);
         add(jl3);
         add(jl4);
         add(jl5);
         add(jl6);
         add(j18);
         add(j2);
         add(j3);
         add(j4);
         
         add(jt1);
         add(jp);
         add(jp1);
         add(jt2);
         add(jta);
         add(jta1);
         add(jr);
         add(jr1);
         add(jcb);
         add(jcb1);
         add(jcb2);
         add(jcb3);
         add(jcb4);
         add(jb1);
         add(jb2);
        
         add(j19);
jb1.addActionListener(this); // it invoke Jb1 action
jb2.addActionListener(this); // it invoke Jb1 action
jcb.addItemListener(this);


    }// clsoign degising part by overloading componet to the RegForm
  
   public void actionPerformed(java.awt.event.ActionEvent ae)
   {
        if(ae.getSource().equals(jb1))
        {
         String str=jt1.getText();
         String st2=jp.getText();
         String str3=  jt2.getText();
            
         java.util.TreeMap<Integer,String> t=new java.util.TreeMap<Integer,String>();
         
         t.put(1,str);
         t.put(2,st2);
         t.put(3,str3);
         
          try
          {
            FileOutputStream f=new FileOutputStream("proj.ser",true);
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(t);
              JOptionPane.showConfirmDialog(null,o);
          }
          catch(Exception eee)
          {
              
          }
        
        }
        
        if(ae.getSource().equals(jb2))
        {
            jt1.setText("");
            jta.setText("");
            jt2.setText("");
            jp.setText("");
            jp1.setText(""); 
            jta1.setText("");
          
            
        }
      
   }
   
   public void itemStateChanged(java.awt.event.ItemEvent ii)
   {
       if(ii.getSource().equals(jcb))
       {
          String s=(String)jcb.getSelectedItem();
         jta.setText("You are Selectd :"+s);
        }
   } 
   

  


}// closing class
