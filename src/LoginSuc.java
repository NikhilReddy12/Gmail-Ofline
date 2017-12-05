/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stp;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author projects
 */
public class LoginSuc extends JFrame
{
    JLabel jl;
    Font f;
    public LoginSuc()
    {
        f=new Font("Arial",22, 22);
        
       setLayout(null);
        
        jl=new JLabel("LoginSuc");
        jl.setFont(f);
        jl.setBounds(200, 200, 160, 40);
        
        add(jl);
        
    }
    
}
