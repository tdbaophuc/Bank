package Controler;

import View.View_LogIn;
import View.View_SignUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp_LogIn implements ActionListener {
    private View_SignUp view_signUp;
    public SignUp_LogIn(View_SignUp view_signUp)
    {
        this.view_signUp=view_signUp;
    }



    StringBuilder stb = new StringBuilder();
    @Override
    public void actionPerformed(ActionEvent e) {
        View_LogIn view_logIn = new View_LogIn();
        View_SignUp view_signUp=new View_SignUp();
        String SRC= e.getActionCommand();
        if (SRC.equals("Log In")) {

            view_logIn.setVisible(true);// hieen thi man hinh log in
            view_signUp.dispose();
        }
        if (SRC.equals("Cancel"))
        {
            view_signUp.dispose();
        }


    }




}
