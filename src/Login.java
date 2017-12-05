package com.stp;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
public class Login extends JFrame implements ActionListener
{
    JLabel jl,jl2,jl3,j14;
    JTextField jt;
    JPasswordField jp;
    JButton jb1,jb2,jb3;
    ImageIcon i;
    Font f;
    public Login()
    {
        f=new Font("Stencil", 25, 25);
    setLayout(null); // it is invokeing Super class of member through super keyword logics..
         
        
    jl=new JLabel("Gmail offline");
    jl.setFont(f);
     jl.setForeground(Color.MAGENTA);
    jl2=new JLabel("UserName:");
    jl2.setForeground(Color.white);
    jl3=new JLabel("Password:");
    jl3.setForeground(Color.white);
    jt=new JTextField("@mail.com");
    jp=new JPasswordField();
     jb1=new JButton("SUBMIT");
     jb2=new JButton("CLEAR");
     jb3=new JButton("SIGNUP");
     jb1.setForeground(Color.blue);
     jb2.setForeground(Color.red);
     jb3.setForeground(Color.green);
     
     i=new ImageIcon("4.jpg");
     j14=new JLabel(i);
     
    // arraging components in Frame place..
     jl.setBounds(350,60, 380,30);
     jl2.setBounds(265, 125,100, 40);
     jt.setBounds(350, 130, 190, 30);
     jl3.setBounds(270, 195,100, 40);
     jp.setBounds(350,200, 190, 30);
     jb1.setBounds(340, 280, 80, 40);
     jb2.setBounds(470, 280, 80, 40);
     jb3.setBounds(390, 360, 120, 40);
     j14.setBounds(0, 0, 800, 600);
    
           
    
     add(jl);// adding jl to Conatiner
    add(jl2);
    add(jt);
    add(jl3);
    add(jp);
    add(jb1);
    add(jb2);
    add(jb3);
    add(j14);
    jb3.addActionListener(this);
    jb1.addActionListener(this);
    jb2.addActionListener(this);
    }// closing desc
    
     public void actionPerformed(java.awt.event.ActionEvent ae)
     {
        if (ae.getSource().equals(jb3))
        {
            RegForm r=new RegForm();
            r.setTitle("regform");
            r.setSize(800, 600);
            r.setVisible(true);
        }
        
        if(ae.getSource().equals(jb1))
        {
        try
        {
            FileInputStream f=new FileInputStream("proj.ser");
            ObjectInputStream i=new ObjectInputStream(f);
            TreeMap t=(TreeMap)i.readObject();
            String str2=(String)t.get(1);
            
            String str=jt.getText();
            
            
            if(str.equals(str2))
            {
                LoginSuc l=new LoginSuc();
                l.setTitle("loginsuc");
                l.setSize(400, 400);
                l.setVisible(true);
            }
            else
            {
                LoginFail l=new LoginFail();
                l.setTitle("loginfail");
                l.setSize(400, 400);
                l.setVisible(true);
            }
          
        }
        catch(Exception eee)
        {
            
        }
        
     }
         if(ae.getSource().equals(jb2))
        {
            jt.setText("");
            jp.setText("");
        }
     }// closing method
}// closing class
